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
    private String paisNacimiento;
    private String status;

    public Refugiado(String identificacion,String  paisNacimiento, String paisDeProcedencia, String paisDestino,String status) {
        this.identificacion = identificacion;
        this.paisNacimiento=paisNacimiento;
        this.paisDeProcedencia = paisDeProcedencia;
        this.paisDestino = paisDestino;
        this.status=status;
    }

    

    public Refugiado() {
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
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
        return getIdentificacion();
    }

    @Override
    public void setPais(String pais) {
        setPaisDeProcedencia(pais);
    }

    @Override
    public String getPais() {
       return getPaisDeProcedencia();
    }

    @Override
    public String getStatus() {
         return status;
    }

    @Override
    public String getPaisLlegada() {
        return paisDestino;
    }

    
}
