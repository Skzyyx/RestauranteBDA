/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.BenjaminSotoCoronado;

import Conexion.Conexion;
import Entidades.ModuloClienteFrecuente.ClienteFrecuente;
import Exception.ModuloClienteFrecuentePersistenciaException;
import Interface.IClienteFrecuente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author benjy
 */
public class ClienteFrecuenteDAO implements IClienteFrecuente {
    public static ClienteFrecuenteDAO instance;
    
    public ClienteFrecuenteDAO(){
    
    }
    
    public static ClienteFrecuenteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteFrecuenteDAO();
        }
        return instance;
    }
    
    @Override
    public ClienteFrecuente registrarClienteFrecuente(ClienteFrecuente clienteFrecuente) throws ModuloClienteFrecuentePersistenciaException{
        
        if (clienteFrecuente == null)throw new ModuloClienteFrecuentePersistenciaException("El cliente frecuente que se desea insertar no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        
        try{
            em.getTransaction().begin();
            em.persist(clienteFrecuente);
            em.getTransaction().commit();
            return clienteFrecuente;
        }catch(Exception e){
            em.getTransaction().rollback();
            throw new ModuloClienteFrecuentePersistenciaException("Ocurrió un error al intentar registrar al cliente frecuente");
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    @Override
    public List<ClienteFrecuente> obtenerClientes(String nombre, String telefono) throws ModuloClienteFrecuentePersistenciaException {
        EntityManager em = Conexion.crearConexion();

        try {
            StringBuilder jpql = new StringBuilder("SELECT c FROM ClienteFrecuente c");
            if (nombre != null) {
                jpql.append(" WHERE LOWER(c.nombre) LIKE :nombre");
            }
            if (telefono != null) {
                jpql.append(nombre != null ? " AND" : " WHERE");
                jpql.append(" c.telefono LIKE :telefono");
            }
            TypedQuery<ClienteFrecuente> query = em.createQuery(jpql.toString(), ClienteFrecuente.class);

            if (nombre != null && !nombre.trim().isEmpty()) {
                query.setParameter("nombre", "%" + nombre + "%");
            }
            if (telefono != null && !telefono.trim().isEmpty()) {
                query.setParameter("telefono", "%" + telefono + "%");
            }

            return query.getResultList();

        } catch (Exception e) {
            throw new ModuloClienteFrecuentePersistenciaException("Ocurrió un error al buscar clientes frecuentes.");
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
    
    @Override
    public ClienteFrecuente actualizarCliente(ClienteFrecuente clienteNuevo) throws ModuloClienteFrecuentePersistenciaException {

        if (clienteNuevo == null || clienteNuevo.getId() == null) {
            throw new ModuloClienteFrecuentePersistenciaException("El cliente frecuente no puede ser nulo");
        }

        EntityManager em = Conexion.crearConexion();
        try {
            em.getTransaction().begin();

            ClienteFrecuente clienteFrecuente = em.find(ClienteFrecuente.class, clienteNuevo.getId());
            if(clienteFrecuente==null){
                throw new ModuloClienteFrecuentePersistenciaException("El cliente frecuente no fue encontrado");
            }
            clienteFrecuente.setNombre(clienteNuevo.getNombre());
            clienteFrecuente.setApellidoPaterno(clienteNuevo.getApellidoPaterno());
            clienteFrecuente.setApellidoMaterno(clienteNuevo.getApellidoMaterno());
            clienteFrecuente.setTelefono(clienteNuevo.getTelefono());
            clienteFrecuente.setEmail(clienteNuevo.getEmail());

            em.getTransaction().commit();

            return clienteFrecuente;

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloClienteFrecuentePersistenciaException("Error al editar el cliente frecuente");
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    
    
}