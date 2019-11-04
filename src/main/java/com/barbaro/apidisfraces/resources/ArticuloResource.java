/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.apidisfraces.resources;

import com.barbaro.apidisfraces.Models.Articulo;
import com.barbaro.apidisfraces.util.DatabaseManager;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ericknavarro
 */

    @Path("partes")
    public class ArticuloResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPartes(){
        
        List<Articulo> articulo = DatabaseManager.getArticulos();
        
        String jsonArticulos = new Gson().toJson(articulo);
        
        //Regresa una respuesta, siempre en un api
        return jsonArticulos;
        
    }
    
    //Indicar el tipo de métrodo
    @POST
    //Entender como vienen los datos de la petición para poder procesarlos
    //MIME TYPES
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED) //
    public String crearPartes(@FormParam("nombre") String nombre, @FormParam("descripcion") String descripcion, @FormParam("precio") float precio, @FormParam("talla")String talla, @FormParam("tipo") String tipo, @FormParam("material") String material, @FormParam("fotoUrl") String fotoUrl){
        
        //Obtener datos es realizado por las anotaciones de @FormParam
        //Que están definidas en los parámetros
        
        //Validar información try/catch
        
        //Crear tu modelo
        Articulo articulo = new Articulo();
        
        articulo.setNombre(nombre);
        articulo.setDescripcion(descripcion);
        articulo.setPrecio(precio);
        articulo.setTalla(talla);
        articulo.setTipo(tipo);
        articulo.setMaterial(material);
        articulo.setFotoUrl(fotoUrl);
        
        //Persistir los datos
        DatabaseManager.addArticulo(articulo);
        
        return "{\"message\":\"Datos guardados con exito\", \"id\":\""+ articulo.getId() +"\"}";
        
    }
    
    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String crearParteJSON(Articulo a){
    
        
    
        return "{\"message\":\"Metodo aun no implementado\"}";
    }*/
    
    @POST
    //Tu me mandaste un JSON
    @Consumes(MediaType.APPLICATION_JSON)
    //Yo te regreso un JSON, indicar un formato de la respuesta
    @Produces(MediaType.APPLICATION_JSON)
    public String crearParteJSONString(String jsonArticulo){
    
        Gson gson = new Gson();
        
        Articulo articulo = gson.fromJson(jsonArticulo, Articulo.class);
        //TODO: implementar capa de persistencia
    
        DatabaseManager.addArticulo(articulo);
        
        return "{\"message\":\"Datos guardados con exito\", \"id\":\""+ articulo.getId() +"\"}";
    }
    
    @GET
    @Path("{id}")
    public String getParteById(@PathParam("id") String id){
        
    
        return "{\"message\":\"Articulo id: "+ id +"\"}";
        
    }
    
    @GET
    @Path("buscar")
    public String getParteByNombre(@QueryParam("nombre") String nombre){
        
    
        return "{\"message\":\"Articulo nombre: "+ nombre +"\"}";
        
    }

    @GET
    @Path("ejemplo/{id}")
    public Response getEjemplo(@PathParam("id") String id){

        return Response.status(Response.Status.NOT_FOUND).entity(null).build();
    }
    

}
