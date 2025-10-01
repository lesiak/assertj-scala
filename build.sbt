val scala2Version = "2.13.15"
val scala3Version = "3.3.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-cross",
    version := "0.1.0",

    libraryDependencies ++= Seq(
      "org.assertj" % "assertj-core" % "3.27.6",
      "org.scalameta" %% "munit" % "1.2.0" % Test
    ),

    // To make the default compiler and REPL use Dotty
    scalaVersion := scala3Version,

    // To cross compile with Scala 3 and Scala 2
    crossScalaVersions := Seq(scala3Version, scala2Version)
  )
