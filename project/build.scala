import sbt._
import Keys._

object build extends Build {
  val sbtXjc = Project(
    id = "sbt-onejar",
    base = file("."),
    settings = Defaults.defaultSettings ++ ScriptedPlugin.scriptedSettings ++ Seq[Project.Setting[_]](
      organization := "com.github.retronym",
      version := "0.8-SNAPSHOT",
      sbtPlugin := true,
      scalacOptions in Compile ++= Seq("-deprecation"),
      publishTo := Some(Resolver.url("sbt-plugin-snapshots", new URL("http://edftwin.com:8081/nexus/content/repositories/snapshots"))(Resolver.ivyStylePatterns)),
      publishMavenStyle := false
    )
  )
}
