package edu.upc.dsa;

import com.google.gson.Gson;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Created by Turpitude on 21/12/2016.
 */

@Path("/json")
public class JSONService {


    @GET
    @Path("/get/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEtakemonInJSON(@PathParam("name") String name) {

        return EtakemonFunctions.getInstance().getEtakemonInJSON(name);
    }

    @POST
    @Path("/new/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String newEtakemon(@PathParam("name") String name,Etakemon etk) {

        return  EtakemonFunctions.getInstance().newEtakemon(name,etk);
    }

    @POST
    @Path("/Login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String Login(User user) {

        return EtakemonFunctions.getInstance().Login(user);
    }

    @POST
    @Path("/Register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String Register(User user) {

        return EtakemonFunctions.getInstance().Register(user);

    }


}