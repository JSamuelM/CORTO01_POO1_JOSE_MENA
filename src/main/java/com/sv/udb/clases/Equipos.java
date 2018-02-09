/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Equipos {
    private String name;
    private List<Jugadores> listJugadores;

    public Equipos() {
    }

    public Equipos(String name, List<Jugadores> listJugadores) {
        this.name = name;
        this.listJugadores = listJugadores;
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
    
}
