package com.laboratorio.laboratorio_backend.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.laboratorio_backend.Models.PrincipalModel;
import com.laboratorio.laboratorio_backend.Services.PrincipalService;


@RestController
@RequestMapping("/api/electronicos")
public class PrincipalController {
   
    private final PrincipalService principalService;

    //Este es de prueba
    @GetMapping("/hola")
    public String traerDatos(){
        return "Hola";
    }

   //Traemos el servicio para construir lo necesario para trabajar
    public PrincipalController(PrincipalService principalService){
        this.principalService=principalService;
    }

   //Con GetMapping hacemos que la ruta de la api traiga todos los datos del model
    @GetMapping
    public ResponseEntity<List<PrincipalModel>> getElectronicos(){
        try{
            List<PrincipalModel> electronicos = principalService.obtenerElementos();
            return new ResponseEntity<>(electronicos, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
