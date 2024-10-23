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

    public PrincipalController(PrincipalService principalService){
        this.principalService=principalService;
    }

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
