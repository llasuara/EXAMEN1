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
public class Pais {
    
    private int cantidadPersonas;
    private String nombre;
    public Pais( String nombre, int cantidadPersonas) {
        this.nombre=nombre;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public void quitarPersona(int resta){
        cantidadPersonas=cantidadPersonas-resta;
    }
        
    
    
    
    
    
}
