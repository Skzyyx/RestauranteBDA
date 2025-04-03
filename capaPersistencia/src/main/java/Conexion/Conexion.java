/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author skyro
 */
public class Conexion {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
    
    public static EntityManager crearConexion() {    //Se obtiene un nuevo EntityManager en cada llamada a getEntityManager(), pero sin recrear la fábrica.
        return emf.createEntityManager(); // Se reutiliza la fábrica y se obtiene un nuevo EntityManager
    }
    
    public static void cerrar() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
