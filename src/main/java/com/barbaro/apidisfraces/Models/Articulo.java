/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.apidisfraces.Models;

/**
 *
 * @author ericknavarro
 */
public class Articulo {
    
    public enum TipoArticulo{
    
        CABEZA, CARA, TORSO, BRAZO, PIES, ACCESORIOS
        
    }
    
    private String id;
    private String nombre;
    private String descripcion;
    private float precio;
    private String material;
    private String talla;
    private String tipo;
    private String fotoUrl;

    public Articulo() {
    }

    public Articulo(String id, String nombre, String descripcion, float precio, String material, String talla, String tipo, String fotoUrl) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.material = material;
        this.talla = talla;
        this.tipo = tipo;
        this.fotoUrl = fotoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the fotoUrl
     */
    public String getFotoUrl() {
        return fotoUrl;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param fotoUrl the fotoUrl to set
     */
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{\"id\":\""+id+"\"," +
                "\"Nombre\":\""+nombre+"\"," +
                "\"Descripcion\":\""+descripcion+"\"," +
                "\"Precio\":\""+precio+"\"," +
                "\"Material\":\""+material+"\"," +
                "\"Talla\":\""+talla+"\"," +
                "\"Tipo\":\""+tipo+"\"," +
                "\"Url\":\""+fotoUrl+"\"}";
    }
    
    
    
    
}
