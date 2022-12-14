

plugins {
	id("org.springframework.boot") version "3.0.0"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.20"
	kotlin("plugin.spring") version "1.7.20"
	kotlin("plugin.jpa") version "1.7.20" apply false
}

group = "com.yzq.tutor"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17

//repositories {
//	mavenCentral()
//	maven { url = uri("https://repo.spring.io/milestone") }
//}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.mysql:mysql-connector-j")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
subprojects{
	apply {
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
	}
	dependencyManagement{
		dependencies{
			dependency("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.0")


		}
	}
	dependencies{
		implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui")

		developmentOnly("org.springframework.boot:spring-boot-devtools")
		runtimeOnly("com.mysql:mysql-connector-j")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
	}
}
