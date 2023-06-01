
package com.iudigital.productos.thread;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;


public class CajeraThreadProducto extends Thread {
    
    private String nombre;
    private ClienteProducto cliente;
    private long initialTime;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
    
    @Override
    public void run(){
        System.out.println(" la cajera "+ this.nombre 
                +"comienza a procesar la compra del cliente " 
                + this.cliente.getNombre() + "en el tiempo" 
                +(System.currentTimeMillis()-this.initialTime)/1000 
                +" seg ---------------------");
        
            int contCliente = 1;
    for (Producto producto :cliente.getProductos()) { 
        this.esperarXsegundos();
        System.out.println("Procesando el producto " + contCliente 
                + " nombre producto " + producto.getNombre() 
                + " precio producto " + producto.getPrecio()
                + " cantidad fr productos " + producto.getCantidad()
                + " costo  total del producto "
                + producto.getCantidad() * producto.getPrecio()
                + " mas el tiempo" + (System.currentTimeMillis()-this.initialTime)/ 1000
                + " seg --------------------------");
        contCliente++;
       
    }  
    System.out.println(" la cajeta " + this.nombre + " a terminado e procesar " 
            + this.cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis()-this.initialTime)/ 1000
                + " seg --------------------------");
    }
    private void esperarXsegundos (){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}    