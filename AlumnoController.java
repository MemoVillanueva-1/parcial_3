package com.example.prueba;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/crear/{nombre}/{edad}/{sexo}")
    public String crearAlumno(@PathVariable String nombre,
                                @PathVariable int edad,
                                @PathVariable String sexo) {

        return "Nombre: "+nombre+" tu Edad: "+edad+" tu Sexo: "+sexo;
    }

}