/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import POJO.Stock;
import POJO.User;
import Utilities.DB_USER;
import com.google.gson.Gson;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.MessageBodyWriter;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.*;


/**
 * REST Web Service
 *
 * @author patel
 */
//@Path("generic")
@Path("stock")
@Produces(MediaType.APPLICATION_JSON)
public class StockService implements MessageBodyWriter<Stock>{


    @Path("test")
    @GET
    @Produces("text/html")
    public String test() {
        //TODO return proper representation object
        return "<html><body><h1>Hello, RESTful!!</body></h1></html>";
    }
 
/*********************          Call this path when index page loads for Chevron Corp. stock Prices           ************************************/     
    @GET
    @Path("apple/latest")
    public Stock all(@PathParam("count") int count) throws FileNotFoundException {
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target
        ("https://cloud.iexapis.com/beta/stock/aapl/quote?token=pk_3c07c6fdac2843148e04812f6ed80784&symbols=aapl");
       
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if (response.getStatus() == 200) {
            String output = response.readEntity(String.class);
            JSONObject data = new JSONObject(output);
            
//            //Create Stock object to return to client
            Stock stock= new Stock(
                    data.getString("companyName"),
                    data.getDouble("open"),
                    data.getDouble("high"),
                    data.getDouble("low"),
                    data.getDouble("close"),
                    data.getString("latestTime"),
                    data.getInt("latestVolume"));
//            return stock;
            return stock;
        } else {
            return null;
        }
    }
    
    /**********************     IBM API ******************************/
    
    @GET
    @Path("ibm/latest")
    public Stock vodafone(@PathParam("count") int count) throws FileNotFoundException {
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target
        ("https://cloud.iexapis.com/beta/stock/ibm/quote?token=pk_3c07c6fdac2843148e04812f6ed80784&symbols=aapl");
       
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if (response.getStatus() == 200) {
            String output = response.readEntity(String.class);
            JSONObject data = new JSONObject(output);
            
//            //Create Stock object to return to client
            Stock stock= new Stock(
                    data.getString("companyName"),
                    data.getDouble("open"),
                    data.getDouble("high"),
                    data.getDouble("low"),
                    data.getDouble("close"),
                    data.getString("latestTime"),
                    data.getInt("latestVolume"));
//            return stock;
            return stock;
        } else {
            return null;
        }
    }
    
    
    /**********************     Boeing API ******************************/
    
    @GET
    @Path("boeing/latest")
    public Stock boeing(@PathParam("count") int count) throws FileNotFoundException {
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target
        ("https://cloud.iexapis.com/beta/stock/ba/quote?token=pk_3c07c6fdac2843148e04812f6ed80784&symbols=aapl");
       
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if (response.getStatus() == 200) {
            String output = response.readEntity(String.class);
            JSONObject data = new JSONObject(output);
            
//            //Create Stock object to return to client
            Stock stock= new Stock(
                    data.getString("companyName"),
                    data.getDouble("open"),
                    data.getDouble("high"),
                    data.getDouble("low"),
                    data.getDouble("close"),
                    data.getString("latestTime"),
                    data.getInt("latestVolume"));
//            return stock;
            return stock;
        } else {
            return null;
        }
    }
    
    /**********************     Porsche API ******************************/
    
    @GET
    @Path("tesla/latest")
    public Stock porsche(@PathParam("count") int count) throws FileNotFoundException {
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target
        ("https://cloud.iexapis.com/beta/stock/tsla/quote?token=pk_3c07c6fdac2843148e04812f6ed80784&symbols=aapl");
       
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if (response.getStatus() == 200) {
            String output = response.readEntity(String.class);
            JSONObject data = new JSONObject(output);
            
//            //Create Stock object to return to client
            Stock stock= new Stock(
                    data.getString("companyName"),
                    data.getDouble("open"),
                    data.getDouble("high"),
                    data.getDouble("low"),
                    data.getDouble("close"),
                    data.getString("latestTime"),
                    data.getInt("latestVolume"));
//            return stock;
            return stock;
        } else {
            return null;
        }
    }
    
    
    
    
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getSize(Stock t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeTo(Stock t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
//        Gson gson = new Gson(); 
//        String json= gson.toJson(t);
//        DataOutputStream dataOtputStream = new DataOutputStream(entityStream);
//        dataOtputStream.writeBytes(json);
    }
    
}

    

