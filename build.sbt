name := "haskel-hexagonal"

version := "1.0"

scalaVersion := "2.13.3"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
updateOptions := updateOptions.value.withGigahorse(false)

libraryDependencies ++= Seq(
  guice,
)
