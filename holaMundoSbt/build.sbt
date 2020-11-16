    name    := "holaMundoSbt"
    version := "1.3.13"
    scalaVersion := "2.11.8"
    lazy val hello = taskKey[Unit]("An example task¡¡¡¡¡¡¡¡¡¡")
    lazy val commonSettings = Seq(
        target := { baseDirectory.value / "target2" }
    )       
    lazy val root = (project in file("."))
    .settings(
        hello := { println("Hello!") }
    )

    lazy val llamar = (project in file("llamar"))
    .settings(
         commonSettings,
     )