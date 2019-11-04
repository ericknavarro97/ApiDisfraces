/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.apidisfraces.Models;

import java.util.List;

/**
 *
 * @author ericknavarro
 */
public class Disfraz {
    
    private String id;
    private List<Articulo> cabeza;
    private List<Articulo> cara;
    private List<Articulo> torso;
    private List<Articulo> brazos;
    private List<Articulo> pies;
    private List<Articulo> perinas;
    private List<Articulo> accesorios;

    /**
     * @return the accesorios
     */
    public List<Articulo> getAccesorios() {
        return accesorios;
    }

    /**
     * @return the brazos
     */
    public List<Articulo> getBrazos() {
        return brazos;
    }

    /**
     * @return the cabeza
     */
    public List<Articulo> getCabeza() {
        return cabeza;
    }

    /**
     * @return the cara
     */
    public List<Articulo> getCara() {
        return cara;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the perinas
     */
    public List<Articulo> getPerinas() {
        return perinas;
    }

    /**
     * @return the pies
     */
    public List<Articulo> getPies() {
        return pies;
    }

    /**
     * @return the torso
     */
    public List<Articulo> getTorso() {
        return torso;
    }

    /**
     * @param accesorios the accesorios to set
     */
    public void setAccesorios(List<Articulo> accesorios) {
        this.accesorios = accesorios;
    }

    /**
     * @param brazos the brazos to set
     */
    public void setBrazos(List<Articulo> brazos) {
        this.brazos = brazos;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(List<Articulo> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @param cara the cara to set
     */
    public void setCara(List<Articulo> cara) {
        this.cara = cara;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param perinas the perinas to set
     */
    public void setPerinas(List<Articulo> perinas) {
        this.perinas = perinas;
    }

    /**
     * @param pies the pies to set
     */
    public void setPies(List<Articulo> pies) {
        this.pies = pies;
    }

    /**
     * @param torso the torso to set
     */
    public void setTorso(List<Articulo> torso) {
        this.torso = torso;
    }
    
    
    
}
