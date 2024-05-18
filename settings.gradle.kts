pluginManagement {
	repositories {
		gradlePluginPortal()
		maven("https://maven.fabricmc.net")
	}

	plugins {
		id("fabric-loom") version "1.6-SNAPSHOT"
		kotlin("jvm") version "1.9.24"
	}
}
