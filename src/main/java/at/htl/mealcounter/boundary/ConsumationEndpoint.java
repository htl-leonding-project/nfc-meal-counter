package at.htl.mealcounter.boundary;


import at.htl.mealcounter.control.ConsumationRepository;
import at.htl.mealcounter.entity.Consumation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

@RequestScoped
@Path("/consumation")
public class ConsumationEndpoint {


    @Inject
    ConsumationRepository consumationRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response.ok(consumationRepository.findAll()).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Consumation consumation, @Context UriInfo info) {

        consumation = consumationRepository.save(consumation);
        return Response.created(URI.create(info.getPath() + "/"+ consumation.getId())).build();

    }




}
