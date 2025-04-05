/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ModuloClienteFrecuente;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 *
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
 */
@Entity
@DiscriminatorValue("Frecuente")
public class ClienteFrecuente extends Cliente implements Serializable {

    @Transient
    @Column(name = "visitasAcumuladas", nullable = true)
    private Integer visitasAcumuladas;
    
    @Transient
    @Column(name = "gastoTotalAcumulado", nullable = true)
    private Double gastoTotalAcumulado;
    
    @Transient
    @Column(name = "puntosAcumulados", nullable = true)
    private Double puntosAcumulados;

    public ClienteFrecuente() {
    }

    public ClienteFrecuente(Integer visitasAcumuladas, Double gastoTotalAcumulado, Double puntosAcumulados, Long id, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String email, Date fechaRegistro) {
        super(id, nombre, apellidoPaterno, apellidoMaterno, telefono, email, fechaRegistro);
        this.visitasAcumuladas = visitasAcumuladas;
        this.gastoTotalAcumulado = gastoTotalAcumulado;
        this.puntosAcumulados = puntosAcumulados;
    }

    public ClienteFrecuente(Integer visitasAcumuladas, Double gastoTotalAcumulado, Double puntosAcumulados, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String email, Date fechaRegistro) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, email, fechaRegistro);
        this.visitasAcumuladas = visitasAcumuladas;
        this.gastoTotalAcumulado = gastoTotalAcumulado;
        this.puntosAcumulados = puntosAcumulados;
    }

    public Integer getVisitasAcumuladas() {
        return visitasAcumuladas;
    }

    public void setVisitasAcumuladas(Integer visitasAcumuladas) {
        this.visitasAcumuladas = visitasAcumuladas;
    }

    public Double getGastoTotalAcumulado() {
        return gastoTotalAcumulado;
    }

    public void setGastoTotalAcumulado(Double gastoTotalAcumulado) {
        this.gastoTotalAcumulado = gastoTotalAcumulado;
    }

    public Double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public String toString() {
        return "ClienteFrecuente{" + "visitasAcumuladas=" + visitasAcumuladas + ", gastoTotalAcumulado=" + gastoTotalAcumulado + ", puntosAcumulados=" + puntosAcumulados + '}';
    }
    
}
