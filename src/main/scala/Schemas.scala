import org.apache.spark.sql.types._

object Schemas {
  val paySimSchema = StructType(Array(
    StructField("step", IntegerType, true),
    StructField("type", StringType, true),
    StructField("amount", DoubleType, true),
    StructField("nameOrig", StringType, true),
    StructField("oldbalanceOrg", DoubleType, true),
    StructField("newbalanceOrig", DoubleType, true),
    StructField("nameDest", StringType, true),
    StructField("oldbalanceDest", DoubleType, true),
    StructField("newbalanceDest", DoubleType, true),
    StructField("isFraud", IntegerType, true),
    StructField("isFlaggedFraud", IntegerType, true)
  ))
}
