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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author llasu
 */
public class Controlador implements ActionListener {
    private FabricaPersonas fabrica;
    Ventana ventanita;
    Plantilla plantilla;
    Embajada embajada;

    public Controlador(Ventana vent) {
        this.ventanita=vent;
        plantilla=new Plantilla();
        embajada = new Embajada();
        fabrica = new FabricaPersonas();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar")){
            if(!ventanita.getTextFieldIdentificacion().equals("")&&ventanita.getTextFieldPaisProcedente().equals("")&&ventanita.getTextFieldPaisDestino().equals("")){
                fabrica.getPersona(ventanita.regresarTipo(), ventanita.getTextFieldIdentificacion(),ventanita.getTextFieldPaisProcedente(),ventanita.getTextFieldPaisDestino());
                ventanita.regresarTexto();
                ventanita.limpiar();
                JOptionPane.showMessageDialog(null,"Usuario agragado con exito");
            }
            else{
               JOptionPane.showMessageDialog(null,"Por favor llene los espacios vacios" );
            }
        }
    }
    
}
