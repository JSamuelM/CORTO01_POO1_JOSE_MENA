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
public class ControladorEquipo {
    List<Equipos> listEquipos;

    public ControladorEquipo() {
    }
    
    public void agregarJugadorAEquipo(String name, List<Jugadores> listJugadores)
    {
        this.listEquipos.add(new Equipos(name, listJugadores));
    }
}
