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
public class Refugiado implements Persona {
    private String identificacion;
    private String paisDeProcedencia;
    private String paisDestino;

    public Refugiado(String identificacion, String paisDeProcedencia, String paisDestino) {
        this.identificacion = identificacion;
        this.paisDeProcedencia = paisDeProcedencia;
        this.paisDestino = paisDestino;
    }

    

    public Refugiado() {
    }
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public void setPaisDeProcedencia(String paisDeProcedencia) {
        this.paisDeProcedencia = paisDeProcedencia;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
    

    @Override
    public String documentacionParaEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
