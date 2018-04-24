import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resource")
public class Resource {

    @GET
    public String sayHelloWorld(){
        return "Hello World!";
    }

}
