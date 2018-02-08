/*
 * Clase donde estan todos los metodos necesarios para poder agregar Jugadores
 * y mostrarlos en un List
 */
package com.sv.udb.clases;

import com.sv.udb.clases.Jugadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Controlador {
    List<Jugadores> listJugadores;
    
    public Controlador()
    {
        this.listJugadores = new ArrayList<>();
    }
    
    /**
     * Metodo para poder agregar un jugador a la lista recibiendo como parametros sus datos
     * @param nombre
     * @param edad
     * @param estatura
     * @param peso 
     */
    public void agregarJugador(String nombre, int edad, int estatura, double peso)
    {
        this.listJugadores.add(new Jugadores(nombre, edad, estatura, peso));
    }
    
    public List<Jugadores> listaJugadores()
    {
        return this.listJugadores;
    }
    
    public List<Jugadores> jugadorMasAlto()
    {
        Collections.sort(listJugadores, (Jugadores o1, Jugadores o2) -> new Integer(o2.getEstatura()).compareTo(new Integer(o1.getEstatura())));
        System.out.println("Jugador de mayor a menor estatura: " + listJugadores);
        return this.listJugadores;
    }
    
    public List<Jugadores> jugadorMenorEdad()
    {
        Collections.sort(listJugadores, (Jugadores o1, Jugadores o2) -> new Integer(o1.getEdad()).compareTo(new Integer(o2.getEdad())));
        System.out.println("Jugador de menor a mayor edad: " + listJugadores);
        return this.listJugadores;
    }
    
    public List<Jugadores> jugadorMasPeso()
    {
        Collections.sort(listJugadores, (Jugadores o1, Jugadores o2) -> new Double(o2.getPeso()).compareTo(new Double(o1.getPeso())));
        System.out.println("Jugador de mayor a menor peso: " + listJugadores);
        return this.listJugadores;
    }
}
