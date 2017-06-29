
name := "why-sql-talk-demo"

version := "1.0"

scalaVersion := "2.11.11"

val sparkVersion = "2.1.1"

javacOptions ++= Seq("-encoding", "UTF-8")
javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

// Note the dependencies are provided
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "compile",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "compile"
)
        