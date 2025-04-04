/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Grupo;

import Entidades.BenjaminSotoCoronado.Cliente;
import Enums.EstadoComanda;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
 */
@Entity
public class Comanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "folio", unique = true, nullable = false)
    private String folio;
    
    @Column(name = "fechaHora", nullable = false)
    private LocalDate fechaHora;
    
    @Column(name = "totalVenta", nullable = false)
    private Double totalVenta;
    
    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoComanda estado;
    
    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Comanda() {
    }

    public Comanda(Long id, String folio, LocalDate fechaHora, Double totalVenta, EstadoComanda estado, Mesa mesa, Cliente cliente) {
        this.id = id;
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.totalVenta = totalVenta;
        this.estado = estado;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public Comanda(String folio, LocalDate fechaHora, Double totalVenta, EstadoComanda estado, Mesa mesa, Cliente cliente) {
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.totalVenta = totalVenta;
        this.estado = estado;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public EstadoComanda getEstado() {
        return estado;
    }

    public void setEstado(EstadoComanda estado) {
        this.estado = estado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Comanda{" + "id=" + id + ", folio=" + folio + ", fechaHora=" + fechaHora + ", totalVenta=" + totalVenta + ", estado=" + estado + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
}
