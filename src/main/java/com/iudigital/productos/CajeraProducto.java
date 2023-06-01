
package com.iudigital.productos;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;

public class CajeraProducto {
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }

 
      
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        System.out.println("La cajera " +this.nombre
                +" comieza a procesar la compra del cliente " + cliente.getNombre()
                + " en el tiempo " +(System.currentTimeMillis()-timeStamp)/1000 
                + "segundos -----------------------");
    
    int contCliente = 1;
    for (Producto producto :cliente.getProductos()) { 
        this.esperarXsegundos();
        System.out.println("Procesando el producto " + contCliente 
                + " nombre producto " + producto.getNombre() 
                + " precio producto " + producto.getPrecio()
                + " cantidad fr productos " + producto.getCantidad()
                + " costo  total del producto "
                + producto.getCantidad() * producto.getPrecio()
                + " mas el tiempo" + (System.currentTimeMillis()-timeStamp)/ 1000
                + " seg --------------------------");
       
    }  
    System.out.println(" la cajeta " + this.nombre + " a terminado e procesar " 
            + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis()-timeStamp)/ 1000
                + " seg --------------------------");
    }
   private void esperarXsegundos(){
       try{
           Thread.sleep(1000);
       } catch (InterruptedException ex){
        Thread.currentThread().interrupt();
       }
   }

  
        }
    

