// Mac OS
//brew tap pivotal/tap
//brew install springboot
// wget https://github.com/spring-projects/spring-boot/archive/v2.1.0.RELEASE.zip
// unzip v2.1.0.RELEASE.zip
// cd spring-boot-2.1.0.RELEASE
// ./mvnw -f spring-boot-project/spring-boot-starters/pom.xml -Dmaven.test.skip=true install
// spring install spring-boot-starter-web
//initializr.groovy
@Grab('io.spring.initializr:initializr-web:0.7.0.BUILD-SNAPSHOT')
@Grab('spring-boot-starter-web')
class InitializrApplication {}
//sping run initalizr.groovy
