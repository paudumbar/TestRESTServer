package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.lang.Exception;

public class HelloWorldResource extends ServerResource {

    @Get
    public String represent() {

        System.out.println("Get Before Sleep");
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Get After Sleep");

        return "hello, world";
    }

    @Post
    public String postMethod() {

        System.out.println("Before Sleep");
        try {
            Thread.sleep(5000);
        } catch ( Exception e ){
            e.printStackTrace();
        }

        System.out.println("After Sleep");
        return "hello, world";
    }
}
