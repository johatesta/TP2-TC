package com.tp2.clasesAux;

import java.util.*;

public class Contexto {
    private String nombre;
    private Map<String, Symbol> tablaSimbolos;
    private Contexto contextoPadre;
    
    public Contexto(String nombre, Contexto contextoPadre) {
        this.nombre = nombre;
        this.contextoPadre = contextoPadre;
        this.tablaSimbolos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Contexto getContextoPadre() {
        return contextoPadre;
    }

    public boolean contieneSimbolo(String nombreSimbolo) {
        return tablaSimbolos.containsKey(nombreSimbolo);
    }

    public void agregarSimbolo(Symbol simbolo) {
        tablaSimbolos.put(simbolo.getNombre(), simbolo);
    }

    public Symbol obtenerSimbolo(String nombreSimbolo) {
        return tablaSimbolos.get(nombreSimbolo);
    }

    // Otros métodos relevantes para el manejo de símbolos en el contexto
}

