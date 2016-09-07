SSL Self-Signed Keystore

```
$ keytool -genkey -alias tomcat -keyalg RSA -keystore src/main/resources/keystore.jks

Enter keystore password: tomcat 
Re-enter new password:      tomcat

What is your first and last name?
  [Unknown]:     apress media 
What is the name of your organizational unit?
  [Unknown]:     publishing 
What is the name of your organization?
  [Unknown]:     apress 
What is the name of your City or Locality?
  [Unknown]:     ny
What is the name of your State or Province?
  [Unknown]:     ny 
What is the two-letter country code for this unit?
  [Unknown]:     us 
Is CN=apress media, OU=publishing, O=apress, L=ny, ST=ny, C=us correct?
  [no]:     yes

Enter key password for <tomcat>
     (RETURN if same as keystore password):
 ```
 
 Packaging the project using maven
 ```
 $ mvn package
 $ package -DskipTests=true
 $ java -jar target/spring-boot-12-journal-0.0.1-SNAPSHOT.jar
 ```
 
To use profiles simply create a application-<profile>.properties: 
 ```
 java -Dspring.profiles.active="container" -jar target/spring-boot-journal-0.0.1-SNAPSHOT.war
 ```
 
Now the question is, how can you activate the profiles in a Tomcat-based container? It’s as simple as adding the property spring.profiles.active=container in the <tomcat-installation>/conf/catalina. properties file.
If you are using the tc server, you can go to the same path (the following commands are based on a Mac installation):
```
$ cd /usr/local/Cellar/tcserver/<version>/libexec/
$ cd myserver/conf 
$ echo spring.profiles.active=container >> catalina.properties
```

This command will append the properties to the catalina.properties file (see the double >> ). Next you can start your tc server and see the activated logs and the profile container.