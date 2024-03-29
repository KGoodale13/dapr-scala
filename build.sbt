name := "dapr-scala"

version := "0.1"

scalaVersion := "2.12.10"

PB.targets in Compile := Seq(
  scalapb.gen(flatPackage = true) -> (scalaSource in Compile).value
)

libraryDependencies ++= Seq(
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)
