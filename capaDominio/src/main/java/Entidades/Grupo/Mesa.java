/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Grupo;

import Enums.EstadoMesa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
 */
@Entity
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero", nullable = false, unique = true)
    private Integer numeroMesa;
    
    @Column(name = "estadoMesa", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private EstadoMesa estado;

    public Mesa() {
    }

    public Mesa(Long id, Integer numeroMesa, EstadoMesa estado) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.estado = estado;
    }

    public Mesa(Integer numeroMesa, EstadoMesa estado) {
        this.numeroMesa = numeroMesa;
        this.estado = estado;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public EstadoMesa getEstado() {
        return estado;
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", numeroMesa=" + numeroMesa + ", estado=" + estado + '}';
    }
    
}
