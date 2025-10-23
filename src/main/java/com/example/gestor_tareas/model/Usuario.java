package com.example.gestor_tareas.model;

public class Usuario {
    private String nombre;
    private int edad;

    //contructor vacio
    public Usuario() {

    }

    //constructor con parametros
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //getters y setters(spring los usa para leer JSON)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;

    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
