name := "spark.hbase"
organization := "objektwerks"
version := "0.1"
scalaVersion := "2.12.8"
libraryDependencies ++= {
  val sparkVersion = "2.4.0"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-streaming" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "com.typesafe" % "config" % "1.3.3",
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
}