import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Main {

    public static void main(String []args){


        new Main().imprimirRespuesta();

    }

    public void imprimirRespuesta(){
        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("http://localhost:8080/RestProject6/resources/MyRestService/sayHello");

        Response response = target.request(MediaType.TEXT_HTML).get();

        System.out.println(response.readEntity(String.class));


    }
}
