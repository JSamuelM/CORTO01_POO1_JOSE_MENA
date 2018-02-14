/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Equipos {
    private String name;
    private List<Jugadores> listJugadores;

    /**
     * Constructor que recibe como parametro el nombre del equipo
     * @param name 
     */
    public Equipos(String name) {
        this.name = name;
        this.listJugadores = new ArrayList<>();
    }
    
    public Equipos() {
        this.listJugadores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Jugadores> getListJugadores() {
        return listJugadores;
    }

    public void setListJugadores(List<Jugadores> listJugadores) {
        this.listJugadores = listJugadores;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
