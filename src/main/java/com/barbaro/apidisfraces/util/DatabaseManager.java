/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.apidisfraces.util;

import com.barbaro.apidisfraces.Models.Articulo;
import com.barbaro.apidisfraces.Models.Disfraz;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author ericknavarro
 */
public class DatabaseManager {
    
    //public static List<Disfraz> disfraces;
    
    public static void addDisfraz(Disfraz disfraz){
        
        MongoClient client = MongoClients.create();
        
        MongoDatabase database = client.getDatabase("tienda");
        
        MongoCollection<Document> disfrazCollection = database.getCollection("disfraces");
        
        //Document disfrazDoc = new Document("nombre", dis);
        
        //disfraces.add(disfraz);
        
    
    }
    
    public static void addArticulo(Articulo articulo){
        
        //Abrir una conexión entre mongodb y mi aplicacion
        MongoClient client = MongoClients.create();
        
        //Obtener la base de datos (si no existe, la crea)
        MongoDatabase database = client.getDatabase("tienda");
        
        //Obtener Colección específica (articulos)
        MongoCollection<Document> articulosCollection = database.getCollection("disfraces");
        
        //Moldear tus datos para que los entienda mongo
        //POJO a Documento(BSON)
        Document document = new Document("nombre", articulo.getNombre())
                .append("descripcion", articulo.getDescripcion())
                .append("precio", articulo.getPrecio())
                .append("talla", articulo.getTalla())
                .append("material", articulo.getMaterial())
                .append("fotoUrl", articulo.getFotoUrl());
        
        //insertar en la coleccion especificada
        articulosCollection.insertOne(document);
        
        //Cerrar la coneción del cliente
        client.close();
        
        //Agrega una articulo a la lista
        //articulos.add(articulo);
    
    }
    
    public static List<Articulo> getArticulos(){
    
        //Abrir una conexión entre mongodb y mi aplicacion
        MongoClient client = MongoClients.create();
        
        //Obtener la base de datos (si no existe, la crea)
        MongoDatabase database = client.getDatabase("tienda");
        
        //Obtener Colección específica (articulos)
        MongoCollection<Document> articulosCollection = database.getCollection("disfraces");
        
        //Cursor == ResultSet
        MongoCursor<Document> cursor = articulosCollection.find().iterator();
        
        List<Articulo> articulos = new ArrayList<>();
        
        while(cursor.hasNext()){
        
            Document doc = cursor.next();
            
            Articulo articulo =  new Articulo();
            
            articulo.setId(doc.getObjectId("_id").toString());
            articulo.setNombre(doc.getString("nombre"));
            articulo.setDescripcion(doc.getString("descripcion"));
            articulo.setPrecio(doc.getDouble("precio").floatValue());
            articulo.setTalla(doc.getString("talla"));
            articulo.setTipo(doc.getString("tipo"));
            articulo.setMaterial(doc.getString("material"));
            articulo.setFotoUrl(doc.getString("fotoUrl"));
            
            articulos.add(articulo);
            
        }
        
        return articulos;
    
    }
    
}
