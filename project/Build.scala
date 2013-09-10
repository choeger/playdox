import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playdox"
  val appVersion      = "0.1"

  val appDependencies = Seq(
    "org.webjars" %% "webjars-play" % "2.1.0-3",
    "org.webjars" % "bootstrap" % "3.0.0",
    "com.github.scala-incubator.io" % "scala-io_2.10.2" % "0.4.2",
    jdbc,
    anorm
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalaVersion := "2.10.2"
  )

}
