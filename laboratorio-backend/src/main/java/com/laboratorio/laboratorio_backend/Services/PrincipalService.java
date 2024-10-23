package com.laboratorio.laboratorio_backend.Services;

import org.springframework.stereotype.Service;

import com.laboratorio.laboratorio_backend.Models.PrincipalModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrincipalService {

    public List<PrincipalModel> obtenerElementos(){ //Creamos el método ára poder ponerle datos al modelo
        List<PrincipalModel> elementos= new ArrayList<>(); //Instanciamos un array list para guardar los elementos
        elementos.add(new PrincipalModel(1,"Computadora","Computadora marca Dell")); //Agregamos elementos
        elementos.add(new PrincipalModel(2,"Impresora","Impresora marca Brother"));
        elementos.add(new PrincipalModel(3,"Celular","Celular marca Huawei"));

        return elementos; // Retornamos el objeto de elementos con todo lo que se llenó
    }
    
}
