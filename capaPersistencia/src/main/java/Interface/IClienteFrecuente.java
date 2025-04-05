/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Entidades.ModuloClienteFrecuente.ClienteFrecuente;
import Exception.ModuloClienteFrecuentePersistenciaException;
import java.util.List;

/**
 *
 * @author INSPIRON
 */
public interface IClienteFrecuente {
    
    
    public ClienteFrecuente registrarClienteFrecuente(ClienteFrecuente clienteFrecuente) throws ModuloClienteFrecuentePersistenciaException;

    public List<ClienteFrecuente> obtenerClientes(String nombre, String telefono) throws ModuloClienteFrecuentePersistenciaException;
    
    public ClienteFrecuente actualizarCliente(ClienteFrecuente cliente) throws ModuloClienteFrecuentePersistenciaException;
}
