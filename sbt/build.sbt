enablePlugins(GatlingPlugin, FrontLinePlugin)

ThisBuild / Keys.useCoursier := false

organization := "io.gatling.frontline"
version := "1.0.0"
scalaVersion := "2.12.12"
scalacOptions := Seq("-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation", "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "3.4.1"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test"
