package com.example.Evaluacion.Entidades;

public class Estudiantes {
    private int codigo;
    private String nombre;
    private String apellido;
    private String[] materia;
    private Float[] notas = new Float[3];


    public Estudiantes(int codigo, String nombre, String apellido, String[] materia, Float[] notas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia =materia;
        this.notas = notas;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String[] getMateria(){
        return materia;
    }
    public void setMateria(String[] materia){
        this.materia = materia;
    }

    public Float[] getNotas(){
        return notas;
    }
    public void setNotas(Float[] notas){
        this.notas = notas;
    }

}
