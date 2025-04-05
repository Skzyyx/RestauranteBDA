 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capanegocio;

import BO.ModuloProducto.ProductoBO;
import DTO.ModuloProducto.ProductoNuevoDTO;
import Enums.EstadoProducto;
import Enums.TipoProducto;
import Exception.ModuloProductoNegocioException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skyro
 */
public class CapaNegocio {

    public static void main(String[] args) {
        
        try {
            ProductoBO bo = ProductoBO.getInstance();
            ProductoNuevoDTO producto = new ProductoNuevoDTO("Sushi", 180.50, TipoProducto.PLATILLO, EstadoProducto.DISPONIBLE, new ArrayList<>());
            bo.agregarProducto(producto);
        } catch (ModuloProductoNegocioException ex) {
            Logger.getLogger(CapaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
