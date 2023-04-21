val scala2Version = "2.13.8"
val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-cross",
    version := "0.1.0",

    libraryDependencies ++= Seq(
      "org.assertj" % "assertj-core" % "3.24.2",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),

    // To make the default compiler and REPL use Dotty
    scalaVersion := scala3Version,

    // To cross compile with Scala 3 and Scala 2
    crossScalaVersions := Seq(scala3Version, scala2Version)
  )
