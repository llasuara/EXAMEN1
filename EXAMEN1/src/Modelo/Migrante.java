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
public class Migrante implements Persona {
   private String identificacion;
   private String paisNacimiento;
   private String paisProcedencia;
   private String paisDestino;
    private String status;

    public Migrante(String identificacion,String paisNacimiento, String paisProcedencia, String paisDestino,String status) {
        this.identificacion = identificacion;
        this.paisNacimiento=paisNacimiento;
        this.paisProcedencia = paisProcedencia;
        this.paisDestino = paisDestino;
        this.status=status;
    }

    
    public Migrante() {
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
       return getIdentificacion();
    }

    @Override
    public void setPais(String pais) {
        setPaisDestino(pais);
    }

    @Override
    public String getPais() {
       return getPaisDestino();
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
