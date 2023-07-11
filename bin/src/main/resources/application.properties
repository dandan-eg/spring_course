#configuration de la datasource

spring.datasource.initialization-mode=always
# Préciser le driver qui sera utilisé pour gérer l'accès à la BDD
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
# Donner le chemin d'accès à la BDD (il commence toujours par le mode de connexion jdbc:{typeDeBDD}://{hôte}/{nomDelaBDD}?{options}
spring.datasource.url=jdbc:mariadb://localhost:3307/jpahibernate?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris

spring.datasource.username=root
spring.datasource.password=

#config de JPA/Hibernate
#dialect : classe permettant de traduire les req vers le SQL spécifiques au SGBD utilisé
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.generate_statistics=false
