plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.14"
}

repositories {
    mavenCentral()
}

javafx {
    version = "21.0.2"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClass.set("opardal.archive.MainApp")
}

application {
    mainClass.set("opardal.archive.MainApp")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--add-modules=ALL-MODULE-PATH")
}

