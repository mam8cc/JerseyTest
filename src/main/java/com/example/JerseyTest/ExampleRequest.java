package com.example.JerseyTest;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("example")
public class ExampleRequest {

    @Path("{example}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String example(@PathParam("example") String example) {
        Logger.getLogger(getClass()).info("Working???");
        return example + "!!!!";
    }

}