//this is a "resource controller" - it servers the greetings aka it handles HTTP requests
// GreetingController handles GET requests for /greeting by returning a new instance 
// of the Greeting class

package hello;

/*The Greeting object must be converted to JSON. Thanks to Spring’s HTTP 
 * message converter support, you don’t need to do this conversion manually. 
 * Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter
 * is automatically chosen to convert the Greeting instance to JSON.
 */

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//This code uses Spring 4’s new @RestController annotation, which marks the class 
//as a controller where every method returns a domain object instead of a view. It’s 
//c for @Controller and @ResponseBody rolled together.
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //The @RequestMapping annotation ensures that HTTP requests to /greeting 
    //are mapped to the greeting() method:
    @RequestMapping("/greeting")
    
    //The @RequestParam binds the value of the query string parameter name into the name 
    //parameter of the greeting() method. If the name parameter is absent in the request, 
    //the defaultValue of "World" is used:
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
