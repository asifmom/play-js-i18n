import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "jsmessagetry"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.github.julienrf" %% "play-jsmessages" % "1.2.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
           resolvers += "julienrf.github.com" at "http://julienrf.github.com/repo/"
    )

}
