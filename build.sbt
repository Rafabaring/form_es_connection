name := """form_es_connection"""
organization := "form_es_connection"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test





libraryDependencies += "io.searchbox" % "jest" % "6.3.1"

libraryDependencies ++= Seq(
  "io.searchbox" % "jest" % "6.3.1", // connect to es
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.slf4j" % "slf4j-nop" % "1.7.30",

  //"com.typesafe.play" %% "play-json" % "2.6.7", // Json.stringify
  "com.typesafe.play" %% "play" % "2.8.0"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "form_es_connection.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "form_es_connection.binders._"
