
package com.iudigital.productos.cliente.producto;

import java.util.List;


public class ClienteProducto {
    private final String nombre;
    private final List<Producto> productos;

    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }   
    
}