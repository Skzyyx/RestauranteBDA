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
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
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
