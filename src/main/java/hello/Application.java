//TO RUN this project:
//mvn clean install (or "mvn clean package" is enough) and:
//java -jar target/gs-rest-service-0.1.0.jar
//OR just: mvn spring-boot:run

//Congratulations! You’ve just developed a RESTful web service with Spring =D


/*The main() method uses Spring Boot’s SpringApplication.run() method to launch 
 * an application. Did you notice that there wasn’t a single line of XML? No web.xml 
 * file either. This web application is 100% pure Java and you didn’t have to deal with 
 * configuring any plumbing or infrastructure.
 */

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation does many things:
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("hi =) and bye!! and nothing else HMMM v11");
    }
}

