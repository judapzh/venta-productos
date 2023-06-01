
package com.iudigital.productos.thread;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;


public class MainThreadProducto {
    public static void main(String[]args){
     
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("peter",productos);
        ClienteProducto cliente2 = new ClienteProducto("maria",productos);
        long initialTime =  System.currentTimeMillis();
        
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("marha",cliente1,initialTime);
        CajeraThreadProducto cajera2= new CajeraThreadProducto("ana",cliente2,initialTime);
        
         cajera1.start();
         cajera2.start();
        
    }
    private static void setProductos(List<Producto> productos){
        Producto p1 = new Producto("sandia",100, 5);
        Producto p2 = new Producto("melon",50, 2);
        Producto p3 = new Producto("uva",700, 9);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        
        
    }
}
