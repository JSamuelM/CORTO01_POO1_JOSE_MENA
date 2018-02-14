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
public class ControladorEquipo {
    List<Equipos> listEquipos;

    public ControladorEquipo() {
        this.listEquipos = new ArrayList<>();
    }
    
    public boolean addEqui(String name)
    {
        boolean resp = false;
        try
        {
            this.listEquipos.add(new Equipos(name));
            resp = true;
        }
        catch(Exception ex)
        {
            System.err.println("Error al guardar Equipo: " + ex.getMessage());
        }
        return resp;
    }
    
    public List<Equipos> consTodo()
    {
        return this.listEquipos;
    }
    
    /**
    * Función que agrega UN jugador a la lista
    * y luego se envía de nuevo al objeto
    *
    * @param equi Equipo a agregar el jugador
    * @param juga Objeto de tipo Jugador a agregar
     * @return verdadero o false dependiendo el resultado de la operación
    */
    
    public boolean agreJugaAList(Equipos equi, Jugadores juga)
    {
        boolean resp = false;
        try
        {
            if(equi != null)
            {
                List<Jugadores> listTemp = equi.getListJugadores(); //Obtiene la lista de jugadores
                listTemp.add(juga); //Agrega el jugador
                equi.setListJugadores(listTemp); //Devuelve la lista con el jugador agregado
                resp = true;
            }
        }
        catch (Exception ex) {
            System.err.println("Error al agregar el Jugador al Equipo: " + ex.getMessage());
        }
        return resp;
    }
}
