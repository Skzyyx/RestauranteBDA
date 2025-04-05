/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DependencyInjector.DependencyInjector;
import Interface.IProductoBO;
import Panel.Grupal.InicioSesion;
import Panel.Grupal.MenuPrincipalAdmin;
import Panel.ModuloProducto.BuscarProducto;
import Panel.ModuloProducto.EditarProducto;
import Panel.ModuloProducto.ModuloProducto;
import Panel.ModuloProducto.RegistrarProducto;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author skyro
 */
public class ControlGeneral {
    
    private String rol;
    
    private JFrame framePrincipal;

    private InicioSesion inicioSesion;
    private MenuPrincipalAdmin menuPrincipalAdmin;
    private ModuloProducto moduloProducto;
    private BuscarProducto buscarProducto;
    private EditarProducto editarProducto;
    private RegistrarProducto registrarProducto;
    
    private IProductoBO productoBO;
    
    public ControlGeneral() {
        framePrincipal = new JFrame("RestauranteBDA");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(1280,720);
        framePrincipal.setLocationRelativeTo(null);
        
        productoBO = DependencyInjector.crearProductoBO();
        
        inicioSesion = new InicioSesion(this);
        menuPrincipalAdmin = new MenuPrincipalAdmin(this);
        moduloProducto = new ModuloProducto(this);
        buscarProducto = new BuscarProducto(this);
        editarProducto = new EditarProducto(this);
        registrarProducto = new RegistrarProducto(this);
    }
    
    
    public void mostrarInicioSesion() {
        cambiarPantalla(inicioSesion);
    }
    
    public void mostrarMenuPrincipalAdmin() {
        cambiarPantalla(menuPrincipalAdmin);
    }
    
    public void mostrarModuloProducto() {
        cambiarPantalla(moduloProducto);
    }
    
    public void mostrarBuscarProducto() {
        cambiarPantalla(buscarProducto);
    }
    
    public void mostrarEditarProducto() {
        cambiarPantalla(editarProducto);
    }
    
    public void mostrarRegistrarProducto() {
        cambiarPantalla(registrarProducto);
    }
    
    private void cambiarPantalla(JPanel pantallaNueva) {
        framePrincipal.getContentPane().removeAll();
        framePrincipal.getContentPane().add(pantallaNueva);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}
