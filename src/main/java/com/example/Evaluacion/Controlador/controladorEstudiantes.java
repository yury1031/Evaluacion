package com.example.Evaluacion.Controlador;
import com.example.Evaluacion.Servicios.servicioEstudiantes;
import com.example.Evaluacion.Entidades.Estudiantes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorEstudiantes {
    servicioEstudiantes servicio = new servicioEstudiantes();

    @GetMapping("/ListarEstudiante")
    public ArrayList<Estudiantes> listarEstudiante(){return servicio.listar();}

    @PostMapping("/AgregarEstudiante")
    public String agregar(@RequestBody Estudiantes estu){
        return servicio.agregarEstudiante(estu);
    }
}
