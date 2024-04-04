Serviços:
Db:
Imagem: 'MySQL:Latest'
ambiente:
- 'MYSQL_ROOT_PASSWORD=8@Uw9#kZm3$pA*7!'
Portas:
- 3306:3306

aplicação:
construir:
contexto:.
dockerfile: Dockerfile
depends_on:
-Db
Portas:
- 8080:8080
ambiente:
SPRING_DATASOURCE_URL: "jdbc:mysql://db:3306/innovix-db?createDataBaseIfNotExist=true"
SPRING_DATASOURCE_USERNAME: "raiz"
SPRING_DATASOURCE_PASSWORD: "8@Uw9#kZm3$pA*7!"
SPRING_DATASOURCE_DRIVERCLASSNAME: "com.mysql.cj.jdbc.Driver"
Spring_JPA_Show_Scull: "Verdade"
SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT: "org.hibernate.dialect.MySQL8Dialect"
SPRING_JPA_DATABASE_PLATFORM: "org.hibernate.dialect.MySQL8Dialect"