[![Build Status](https://travis-ci.org/dmitrysl/springBootAngular2.svg?branch=master)](https://travis-ci.org/dmitrysl/springBootAngular2)

# upcoming changes

## Test section

-- to be updated
    
# spring-boot-angular2 starter kit

Spring Boot with Angular2, Bootstrap4, TypeScript, Sass, Gradle, and Gulp.

## about

a starter project for prototyping restful applications with spring boot, angular2, and bootstrap4.

anuglar2 with es6 support. unit tests with jasmine.

## pre-install

1. install OpenJDK8
    - set `JAVA_HOME` environment variable
1. (optional) install latest gradle
    - otherwise just use `$ ./gradlew`
1. (optional) install python 2.7.x
    - set `PYTHON` environment variable
    - `$ gradle npminstall` may complain otherwise

## install

`$ git clone git@github.com:dmitrysl/spring-boot-angular2`

## build & run

* `$ gradle clean build`
* `$ gradle bootRun`
* using browser, navigate to`localhost:8080`

## further reading

[wiki](https://github.com/dmitrysl/spring-boot-angular2/wiki)

## example

check out my [RVEP](https://gitlab.com/dmitrysl/RVEP/tree/dev) project. it's built and updated according to this starter kit!

## contribute

if you have any input, or contributions, please share!

## license
[MIT](/LICENSE)


## Deploy on heroku

heroku create --buildpack http://github.com/noliar/dotnet-buildpack.git
git push heroku master
heroku auth:token

heroku plugins:install heroku-repo

heroku create pst-portal-java --buildpack heroku/gradle


web: cd build ; java -Dgrails.env=prod -Dserver.port=$PORT $JAVA_OPTS -jar target/*.jar
web: java -Dgrails.env=prod -jar build/libs/jetty-runner.jar --port $PORT build/libs/*.war

web: java $JAVA_OPTS -jar target/dependency/jetty-runner-8.1.7.v20120910.jar --lib target/hibernate-search-demo-0.0.1-SNAPSHOT/WEB-INF/lib --port $PORT --jdbc org.apache.commons.dbcp.BasicDataSource "url=jdbc:h2:mem:vaporware;DB_CLOSE_DELAY=-1" "jdbc/vaporwareDB" target/*.war

