/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import POJO.Stock;
import POJO.User;
import Utilities.DB_USER;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

/**
 * REST Web Service
 *
 * @author patel
 */
@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserInfo implements MessageBodyWriter<User> {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UserInfo
     */
    public UserInfo() {
    }

   @Path("test")
    @GET
    @Produces("text/html")
    public String test() {
        //TODO return proper representation object
        return "<html><body><h1>Hello, User!!</body></h1></html>";
    }
    
    /************************ Get Admin Info from Database *****************/
    
    @Path("admin")
    @GET
    public User info()
    {
        return DB_USER.getUser();      
    }

    /*********************For Other User CRUD Operations ****************/

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getSize(User t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeTo(User t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
