package com.example.Evaluacion.Servicios;
import com.example.Evaluacion.Entidades.Estudiantes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class servicioEstudiantes {
    ArrayList<Estudiantes> lista = new ArrayList<>();

    public servicioEstudiantes() {
        lista.add(new Estudiantes(10,"Juana","Ramirez" ,new String[]{"Quimica","Matematicas","Inglés"} ,new Float[]{2.5f,3.9f,4.2f}));
        lista.add(new Estudiantes(11,"Juan","Ramirez" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.2f,3.5f,4.5f}));
        lista.add(new Estudiantes(12,"Maria","Cristobal" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.4f,3.5f,4.5f}));
        lista.add(new Estudiantes(13,"Esteban","Diaz" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{4.9f,3.5f,4.5f}));
        lista.add(new Estudiantes(14,"Camilo","Cifuentes" ,new String[] {"Quimica","Matematicas","Inglés"} ,new Float[]{3.3f,3.5f,4.5f}));
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

    public Estudiantes buscarEstudiante(int codigo) {
        Estudiantes estu = null;
        for (Estudiantes u : lista) {
            if (u.getCodigo() == codigo) {
                estu = u;
            }
        }
        return estu;
    }

    public String actualizarNotas(Estudiantes estu){
        for (Estudiantes mas: lista){
            if (mas.getCodigo() == estu.getCodigo()){
                mas.setNotas(estu.getNotas());
            }
        }
        return "Notas cambiadas exitosamente";
    }

}
