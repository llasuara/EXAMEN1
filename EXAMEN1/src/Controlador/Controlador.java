/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Fabrica.FabricaPersonas;
import Modelo.Plantilla;
import Vista.Ventana;
import Modelo.Embajada;
import Modelo.Pais;
import Modelo.Persona;
import Vista.PanelInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author llasu
 */
public class Controlador implements ActionListener {
    private FabricaPersonas fabrica;
    Ventana ventanita;
    Plantilla <Persona> personaArray;
    Plantilla<Pais> paisArray;
    Embajada embajada;
    Pais pais;
    PanelInfo panelTabla;

    public Controlador(Ventana vent) {
        this.ventanita=vent;
        personaArray=new Plantilla();
        paisArray = new Plantilla();
        embajada = new Embajada();
        fabrica = new FabricaPersonas();
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar Persona")){
            if(!ventanita.getTextFieldIdentificacion().equals("")&&!ventanita.getPaisProcedente().equals("")&&!ventanita.getPaisDestino().equals("")){
                personaArray.guardar(fabrica.getPersona(ventanita.regresarTipo(), ventanita.getTextFieldIdentificacion(),ventanita.getComboPaisOrigen(), ventanita.getPaisProcedente(),ventanita.getPaisDestino()));
                ventanita.limpiar();
                JOptionPane.showMessageDialog(null,"Usuario agregado con exito");
            }
            else{
               JOptionPane.showMessageDialog(null,"Por favor llene los espacios vacios" );
            }
        }
        else if (e.getActionCommand().equals("Guardar")){
            if(!ventanita.getjTextFieldNombrePais().equals("")&&!ventanita.getjTextCantidadPer().equals("")){
            pais =new Pais(ventanita.getjTextFieldNombrePais(),Integer.parseInt(ventanita.getjTextCantidadPer()));
            paisArray.guardar(pais);
            ventanita.cargarPaises(ventanita.getjTextFieldNombrePais());
            ventanita.limpiar();
            JOptionPane.showMessageDialog(null,"Pais agregado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null,"Por favor llene los espacios vacios");
            }      
        }
        else if(e.getActionCommand().equals("Simulacion")){
            int ramdon;
            int ramdon2;
            int resta=1;
            int simulacion =Integer.parseInt(ventanita.getTxtSimulacion());
            Random  rnd = new Random();
            ramdon=(int)(rnd.nextDouble() *paisArray.tamanio()+0);
            ramdon2=(int)(rnd.nextDouble() *personaArray.tamanio()+0);
            
            for(int i=0;i<simulacion;i++){
               if((paisArray.regresarDato(ramdon).getCantidadPersonas()-1)>=0||personaArray.regresarDato(ramdon).getStatus().equals("Indigena")){
                   
                   if(!paisArray.regresarDato(ramdon).getNombre().equals(personaArray.regresarDato(ramdon2).getPais())){
                      personaArray.regresarDato(ramdon2).setPais(paisArray.regresarDato(ramdon).getNombre());
                      paisArray.regresarDato(ramdon).quitarPersona(resta);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Esta perdona pertenece al mismo pais de destino");
                   }
               }
               
               else{
                   JOptionPane.showMessageDialog(null,"No de aceptan estrangeros");
               }
               
        }
      }
        else if(e.getActionCommand().equals("Generar Informe de Viajes")){
            panelTabla= new PanelInfo();
            if(matrizPersonas()!=null){
                panelTabla.llenarTabla(matrizPersonas());
                panelTabla.setVisible(true);
            }
            else
                 JOptionPane.showMessageDialog(null,"No hay Personas u pais ");
            }
    }//Fin del metodo
    
    
    
    public String [][] matrizPersonas(){
           String lasPersonas [][]=new String[personaArray.tamanio()][4];
            for(int i=0;i<personaArray.tamanio();i++){
               lasPersonas[i][0]=personaArray.regresarDato(i).documentacionParaEntrada();
               lasPersonas[i][1]=personaArray.regresarDato(i).getStatus();
               lasPersonas[i][2]=personaArray.regresarDato(i).getPais();
               lasPersonas[i][3]=personaArray.regresarDato(i).getPaisLlegada();
                
            }
            return lasPersonas;
       }
        public String [][] matrizBusquedad(String busquedad){
           String people [][]=new String[4][1];
            for(int i=0;i<personaArray.tamanio();i++){
                if(personaArray.regresarDato(i).documentacionParaEntrada().equalsIgnoreCase(busquedad)){
                    people[0][0]=personaArray.regresarDato(i).documentacionParaEntrada();
                    people[0][1]=personaArray.regresarDato(i).getStatus();
                    people[0][2]=personaArray.regresarDato(i).getPais();
                    people[0][3]=personaArray.regresarDato(i).getPaisLlegada();

                }
            }
            return people;
       }
    
   
    
}//Fin de la clase
