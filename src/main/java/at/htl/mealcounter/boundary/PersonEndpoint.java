package at.htl.mealcounter.boundary;


import at.htl.mealcounter.control.ConsumationRepository;
import at.htl.mealcounter.control.PersonRepository;
import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

@RequestScoped
@Path("/person")
public class PersonEndpoint {


    @Inject
    PersonRepository personRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response.ok(personRepository.findAll()).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Person person, @Context UriInfo info) {

        person = personRepository.save(person);
        return Response.created(URI.create(info.getPath() + "/"+ person.getId())).build();

    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long id) {
        return Response.ok( personRepository.findById(id)).build();

    }



}
