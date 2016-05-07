/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author llasu
 */
public class Plantilla<T> {
    ArrayList<T> array;
    
    public Plantilla(){
        array=new ArrayList<T>();
    }
    public void guardar(T dato){
      
      array.add(dato);
   }
    public T regresarDato(int posicion){
      return (T)array.get(posicion);
    }
    public int tamanio(){
        return array.size();
    }
    
    
    
}
