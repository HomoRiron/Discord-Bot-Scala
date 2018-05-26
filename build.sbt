name := "discord-4j-bot"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.discord4j" % "Discord4J" % "@VERSION@"
)

resolvers += "jcenter" at "http://jcenter.bintray.com"