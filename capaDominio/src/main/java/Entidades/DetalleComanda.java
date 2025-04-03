/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author skyro
 */
@Entity
public class DetalleComanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;
    
    @Column(name = "precioUnitario", nullable = false)
    private Double precioUnitario;
    
    @Column(name = "importeTotal", nullable = false)
    private Double importeTotal;
    
    @Column(name = "notasEspeciales", nullable = false)
    private String notasEspeciales;
    
    @ManyToOne
    @JoinColumn(name = "comanda_id")
    private Comanda comanda;
    
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public DetalleComanda() {
    }

    public DetalleComanda(Long id, Integer cantidad, Double precioUnitario, Double importeTotal, String notasEspeciales, Comanda comanda, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeTotal = importeTotal;
        this.notasEspeciales = notasEspeciales;
        this.comanda = comanda;
        this.producto = producto;
    }

    public DetalleComanda(Integer cantidad, Double precioUnitario, Double importeTotal, String notasEspeciales, Comanda comanda, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeTotal = importeTotal;
        this.notasEspeciales = notasEspeciales;
        this.comanda = comanda;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getNotasEspeciales() {
        return notasEspeciales;
    }

    public void setNotasEspeciales(String notasEspeciales) {
        this.notasEspeciales = notasEspeciales;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleComanda{" + "id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", importeTotal=" + importeTotal + ", notasEspeciales=" + notasEspeciales + ", comanda=" + comanda + ", producto=" + producto + '}';
    }
    
}
