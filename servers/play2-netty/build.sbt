name := "play2-netty"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, PlayNettyServer)

scalaVersion := "2.12.7"

libraryDependencies += guice

