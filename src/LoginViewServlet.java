import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet(name = "LoginViewServlet",  urlPatterns = "/LoginViewServlet")
public class LoginViewServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Main principal = new Main();

        Client client = ClientBuilder.newClient();

        String user = request.getParameter("user");
        String password = request.getParameter("password");

//        WebTarget target = client.target("http://localhost:8080/RestProject6/resources/MyRestService/loginService?user="+ user +"&password=" + password);
        WebTarget target =
                client.target("http://localhost:8080/RestServerProject/resources/MyRestService/loginService?user="+ user +"&password=" + password);

        Response wsres = target.request(MediaType.TEXT_HTML).get();

        String respuesta = "Interfell Test\n\n";
        int status = wsres.getStatus();


        if(status == 200){
            respuesta += "Successfully connected with response code 200\n";
        }

        respuesta += wsres.toString() + "\n\n";
        respuesta +=  wsres.readEntity(String.class) ;

        System.out.println(respuesta);


//        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(respuesta);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
