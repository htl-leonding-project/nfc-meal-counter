package at.htl.mealcounter.boundary;


import at.htl.mealcounter.control.PersonRepository;
import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.NfcCard;
import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@RequestScoped
@Path("/person")
public class PersonEndpoint {


    @Inject
    PersonRepository personRepository;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response.ok(personRepository.findAll()).build();
    }


    @POST
    @Path("/nfc")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response nfcCardDeteteced(NfcCard data, @Context UriInfo info) {
        System.out.println("Data" + data);
        return Response.ok().build(); //(URI.create(info.getPath() + "/"+ data.nfcId)).build();
        // statt Response.ok(), sollte dann überprüft werden ob essen scho gegessen wurde:
        //    - wenn ja, rotes licht für raspberry pi
        //    - wenn nein, grünes licht für raspberry pi

    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long id) {
        return Response.ok( personRepository.findById(id)).build();

    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") Person person) {
        try {
            personRepository.delete(person);
            return Response
                    .noContent()
                    .build();
        } catch (IllegalArgumentException e) {
            return Response
                    .status(400)
                    .header("Reason","Person with id" + person.getId()  + "does not exist")
                    .build();
        }
    }



}
