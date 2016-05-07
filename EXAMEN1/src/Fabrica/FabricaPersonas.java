/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Modelo.Ciudadano;
import Modelo.Indigena;
import Modelo.Migrante;
import Modelo.Persona;
import Modelo.Refugiado;

/**
 *
 * @author llasu
 */
public class FabricaPersonas {
private Persona instanciaPersona;

public Persona getPersona(String tipo,String paisNacimiento, String identificacion,String paisProcedencia, String paisDestino){
    switch(tipo){
        case "Ciudadano":
            instanciaPersona = new Ciudadano(identificacion,paisNacimiento,paisProcedencia,paisDestino,tipo);
        break;
        
        case "Indigena":
            instanciaPersona = new Indigena(identificacion,paisNacimiento,paisProcedencia,paisDestino,tipo);
        break;
        
        case "Migrante":
            instanciaPersona = new Migrante(identificacion,paisNacimiento,paisProcedencia,paisDestino,tipo);
            
        break;
        
        case "Refugiado":
            instanciaPersona = new Refugiado(identificacion,paisNacimiento,paisProcedencia,paisDestino,tipo);
        break;
      
    }
    return instanciaPersona;
}
    
    
    
}
