package at.htl.mealcounter.boundary;

import at.htl.mealcounter.control.ConsumationRepository;
import at.htl.mealcounter.entity.Consumation;
import com.sun.jersey.api.client.filter.LoggingFilter;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class JerseyClientConsumation {

     static ConsumationRepository consumationRepository;

    public static void main(String[] args) {

        Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
        WebTarget webTarget = client.target("http://localhost:8080/api/consumation").path("findAll");

        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
        Response response = invocationBuilder.get();

        Consumation consumation = response.readEntity(Consumation.class);
        List<Consumation> consumationList = consumationRepository.findAll();

        System.out.println(response.getStatus());
        System.out.println(Arrays.toString( consumationList.toArray(new Consumation[consumationList.size()]) ));


    }

}
