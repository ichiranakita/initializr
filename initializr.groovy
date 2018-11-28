// Mac OS
//brew tap pivotal/tap
//brew install springboot
// wget https://github.com/spring-projects/spring-boot/archive/v2.1.0.RELEASE.zip
// unzip v2.1.0.RELEASE.zip
// cd spring-boot-2.1.0.RELEASE
// ./mvnw install -Pfull
//initializr.groovy
@Grab('io.spring.initializr:initializr-web:0.7.0.BUILD-SNAPSHOT')
@Grab('org.springframework.boot:spring-boot-start-web')
class InitializrApplication {}
//sping run initalizr.groovy
