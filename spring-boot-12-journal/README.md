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