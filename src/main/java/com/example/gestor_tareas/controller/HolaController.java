package com.example.gestor_tareas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.gestor_tareas.model.Usuario;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String decirHola() {
        return "Hola desde el servidor Java 🚀";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre) {
        return "Hola " + nombre + " Bienvenido al servidor Java";
    }
    @PostMapping("/registro")
    public String registrarUsuario(@RequestBody Usuario usuario) {
        return "Hola " + usuario.getNombre() + " tienes " + usuario.getEdad() + " años y tu registro fue exitoso ";
    }
}