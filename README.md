
# Spring Security with Java Persistence API on embedded H2 database


![Java CI with Maven](https://github.com/hemrajanilavesh/spring-security-jpa/actions/workflows/maven.yml/badge.svg)

Using `spring-security` to implement 
  - Basic Authentication with username / password which are stored in H2 Database
  - Authorization through Role Based Access Control

| API  | Required Role | Description |
| ------------ | ---- | --- |
| /greet/citizen | No Authentication | Any user can Access this API  
| /greet/avenger | Avenger or Director | Only users with role `Avenger` or  `Director` can access this API
| /greet/director | Director | Only users with role  `Director` can access this API

  - Security Configuration can be found [here](https://github.com/hemrajanilavesh/spring-security-jpa/blob/main/src/main/java/io/hemrlav/springsecurityjpah2/config/SecurityConfiguration.java)

  - Schema SQL for Users and Authorities can be found [here](https://github.com/hemrajanilavesh/spring-security-jpa/blob/main/src/main/resources/schema.sql)

  - Data SQL which inserts sample users with roles can be found [here](https://github.com/hemrajanilavesh/spring-security-jpa/blob/main/src/main/resources/data.sql)
