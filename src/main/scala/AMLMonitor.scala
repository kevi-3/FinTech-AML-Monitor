import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

object AMLMonitor {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("FinTech-AML-Monitor")
      .master("local[*]")
      .getOrCreate()

    val rawdf = spark.read
      .option("header", "true")
      .schema(Schemas.paySimSchema)
      .csv("data/PS_20174392719_1491204439457_log.csv")

    rawdf.printSchema()
    rawdf.show(25)

    val filtereddf = rawdf.filter(col("type")=== "TRANSFER" || col("type")=== "CASH_OUT")

    filtereddf.show(10)

  }

}
