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
public class Ciudadano implements Persona {
    private String identificacion;
    private String paisProcedencia;
    private String paisDestino;

    public Ciudadano(String identificacion, String paisProcedencia, String paisDestino) {
        this.identificacion = identificacion;
        this.paisProcedencia = paisProcedencia;
        this.paisDestino = paisDestino;
    }

    

    public Ciudadano() {
    }
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
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
