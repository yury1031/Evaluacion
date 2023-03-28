package com.example.Evaluacion.Servicios;
import com.example.Evaluacion.Entidades.Estudiantes;
import java.util.ArrayList;

public class servicioEstudiantes {
    ArrayList<Estudiantes> lista = new ArrayList<>();

    public servicioEstudiantes() {
        lista.add(new Estudiantes(10,"Juana","Ramirez" ,new String[]{"Quimica","Matematicas","Inglés"} ,new Float[]{2.5f,3.9f,4.2f}));
        lista.add(new Estudiantes(11,"Juan","Ramirez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(12,"Maria","Cristobal" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(13,"Esteban","Diaz" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(14,"Camilo","Cifuentes" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(15,"David","Gutierrez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(16,"Ignacia","Caldas" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
        lista.add(new Estudiantes(17,"Alexandra","Merchan" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.0f,3.5f,4.5f}));
    }

    public ArrayList<Estudiantes> listar() {
        return lista;
    }

    public String agregarEstudiante(Estudiantes estu){
        lista.add(estu);
        return "Registro exitoso";
    }



}
