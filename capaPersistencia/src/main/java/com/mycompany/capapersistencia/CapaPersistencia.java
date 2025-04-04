/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.capapersistencia;

import Conexion.Conexion;
import DAO.ProductoDAO;
import Entidades.FreddyAliCastroRoman.Ingrediente;
import Enums.UnidadMedida;
import javax.persistence.EntityManager;

/**
 *
 * @author skyro
 */
public class CapaPersistencia {

    public static void main(String[] args) {

        EntityManager em = Conexion.crearConexion();

        ProductoDAO pDAO = ProductoDAO.getInstance();

        // Crear ingredientes base
        Ingrediente pan = new Ingrediente();
        pan.setNombre("Pan para sandwich");
        pan.setUnidadMedida(UnidadMedida.UNIDADES);
        pan.setStock(100);

        Ingrediente jamon = new Ingrediente();
        jamon.setNombre("Jamón de pavo");
        jamon.setUnidadMedida(UnidadMedida.GRAMOS);
        jamon.setStock(5000);

        Ingrediente mantequilla = new Ingrediente();
        mantequilla.setNombre("Mantequilla");
        mantequilla.setUnidadMedida(UnidadMedida.GRAMOS);
        mantequilla.setStock(2000);

        Ingrediente jamon2 = new Ingrediente();
        jamon2.setNombre("Jamón de pavo");
        jamon2.setUnidadMedida(UnidadMedida.GRAMOS);
        jamon2.setStock(5000);
        
        try {
            em.getTransaction().begin();
            em.persist(pan);
            em.persist(jamon);
            em.persist(mantequilla);
            em.persist(jamon2);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        /*
        // Crear el producto
        Producto sandwich = new Producto();
        sandwich.setNombre("Sándwich de Jamón Clásico");
        sandwich.setPrecio(65.50);
        sandwich.setTipoProducto(TipoProducto.PLATILLO);
        sandwich.setEstadoProducto(EstadoProducto.DISPONIBLE);

        // Crear los ProductoIngrediente y establecer relaciones
        ProductoIngrediente pi1 = new ProductoIngrediente(2, sandwich, pan); // 2 panes
        ProductoIngrediente pi2 = new ProductoIngrediente(100, sandwich, jamon); // 100 gramos de jamón
        ProductoIngrediente pi3 = new ProductoIngrediente(20, sandwich, mantequilla); // 20 gramos de mantequilla

        // Asociar con el producto
        sandwich.getIngredientes().add(pi1);
        sandwich.getIngredientes().add(pi2);
        sandwich.getIngredientes().add(pi3);
        
        try {
            pDAO.agregarProducto(sandwich);
            
            try {
            em.getTransaction().begin();
            em.persist(new Mesa(1, EstadoMesa.LIBRE));
            em.getTransaction().commit();
            } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            } finally {
            em.close();
            }
             
        } catch (PersistenciaException ex) {
            Logger.getLogger(CapaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
}
