# music-school-proto
## Launch
1. Run sql-script.sql and sql-script-data.sql to create a database.
2. In music-school-proto/src/main/resources/application.properties fill in **spring.datasource.username** and **spring.datasource.password** properties.
3. Go to music-school-proto directory.
4. Run command:
```
mvn package
```
5. To start app, run command:
```
mvn spring-boot:run
```
