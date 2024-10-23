package com.laboratorio.laboratorio_backend.Models;

public class PrincipalModel {
    private int id;
    private String nombre;
    private String desc;

    public PrincipalModel() {
    } //Constructos Vacio
    
    public PrincipalModel(int id, String nombre, String desc) {
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
    }// Cosntructor con parámetros

    //Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

  //Me arruiné yo solito, hubiera usado Lombok :')
    
}
