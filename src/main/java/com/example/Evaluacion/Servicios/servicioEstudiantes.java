package com.example.Evaluacion.Servicios;
import com.example.Evaluacion.Entidades.Estudiantes;

import java.util.ArrayList;
import java.util.Arrays;

public class servicioEstudiantes {
    ArrayList<Estudiantes> lista = new ArrayList<>();

    public servicioEstudiantes() {
        lista.add(new Estudiantes(10,"Juana","Ramirez" ,new String[]{"Quimica","Matematicas","Inglés"} ,new Float[]{2.5f,3.9f,4.2f}));
        lista.add(new Estudiantes(11,"Juan","Ramirez" ,new String[] {"Biología","Frances","Portugues"} ,new Float[]{4.2f,3.5f,4.5f}));
        lista.add(new Estudiantes(12,"Maria","Cristobal" ,new String[] {"Algebra","Matematicas","Inglés"} ,new Float[]{4.4f,3.5f,4.5f}));
        lista.add(new Estudiantes(13,"Esteban","Diaz" ,new String[] {"Emprendimiento","Español","Filosofia"} ,new Float[]{4.9f,3.5f,4.5f}));
        lista.add(new Estudiantes(14,"Camilo","Cifuentes" ,new String[] {"Informatica","Valores","Religión"} ,new Float[]{3.3f,3.5f,4.5f}));
        lista.add(new Estudiantes(15,"David","Gutierrez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{2.9f,3.5f,4.5f}));
        lista.add(new Estudiantes(16,"Ignacia","Caldas" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.1f,3.5f,4.5f}));
        lista.add(new Estudiantes(17,"Alexandra","Merchan" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{3.5f,3.5f,4.5f}));
    }

    public ArrayList<Estudiantes> listar() {
        return lista;
    }

    public String agregarEstudiante(Estudiantes estu){
        lista.add(estu);
        return "Registro exitoso";
    }

    public Float actualizarNotas(Estudiantes estu){
        boolean respu = false;
        for (Estudiantes mas: lista){
            if (mas.getCodigo() == estu.getCodigo()){
                mas.setNotas(estu.getNotas());

                respu = true;
            }
        }

        String respuesta = "";

        if (respu == true){
            respuesta = "Se modificaron las notas";
        }else {
            respuesta = "No se modificaron las notas";
        }
        return Float.valueOf(respuesta);
    }


    public String notaMayor (Estudiantes estu){
        String respuesta = "";
        for (Estudiantes mas:lista){
            if (Arrays.stream(estu.getNotas()).max(estu.setNotas(mas))) {
                respuesta = "La nota mayor esta";
            }else {
                respuesta = "";
            }
        }
        return respuesta;
    }




}
