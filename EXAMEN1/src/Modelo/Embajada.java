/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author llasu
 */
public class Embajada {
    private static Embajada singleton=new Embajada();
    
    public static Embajada getInstancia(){
        return singleton;
    }
    
    
}
