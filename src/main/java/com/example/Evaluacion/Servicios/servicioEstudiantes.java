package com.example.Evaluacion.Servicios;
import com.example.Evaluacion.Entidades.estudiantes;
import java.util.ArrayList;

public class servicioEstudiantes {
    ArrayList<estudiantes> lista = new ArrayList<>();

    public servicioEstudiantes() {
        lista.add(new estudiantes(10,"Juana","Ramirez" ,new String[]{"Quimica","Matematicas","Inglés"} ,new Float[]{2.5f,3.9f,4.2f}));
        lista.add(new estudiantes(11,"Juan","Ramirez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(12,"Maria","Cristobal" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(13,"Esteban","Diaz" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(14,"Camilo","Cifuentes" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(15,"David","Gutierrez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(16,"Ignacia","Caldas" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new estudiantes(17,"Alexandra","Merchan" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
    }
}
