package com.example.prueba;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {

    @GetMapping("/crear/{nombre}/{edad}/{sexo}/{sueldo}")
    public String crearTrabajador(@PathVariable String nombre,
                                @PathVariable int edad,
                                @PathVariable String sexo,
                                 @PathVariable double sueldo) {

       Trabajador objT = new Trabajador(nombre, edad, sexo, sueldo);



        return "Nombre: "+objT.getNombre()
                +" tu Edad: "+objT.getEdad()
                +" tu Sexo: "+objT.getSexo()
                +" tu Sueldo: "+objT.getSueldo();
    }
}
