package com.aluracursos.tiendaalura.principal;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aluracursos.tiendaalura.modelos.Producto;
import com.aluracursos.tiendaalura.modelos.Tarjeta;

import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************BIENVENIDOS AL SISTEMA**********");
        System.out.println("Ingrese el monto limite de su tarjeta");
        int monto = sc.nextInt();

        // Generacion de instancia de la tarjeta
        var tarjeta = new Tarjeta(monto);
        
        int opcion = 1;
        List<Producto> lista = new ArrayList<>();
        while (opcion != 0) {
            System.out.println("Nombre del producto a comprar");
            String nombre = sc.next();

            System.out.println("Precio del producto a comprar");
            int costo = sc.nextInt();
            
            // Creacion del producto acomprar
            var product = new Producto(nombre, costo);
            boolean compraRealizada = tarjeta.lanzarCompra(product);
            
            // Verificar si hay saldo para la compra
            if (compraRealizada) {
                tarjeta.comprar(product);
                lista.add(product);
                System.out.println("Compra Realizada");
                System.out.println("Desea seguir comprando ingrese 1 para salir 0");
                opcion = sc.nextInt();
            }else{
                System.out.println("Saldo insuficiente");
                opcion = 0;
            }

        
        }
        System.out.println("*****************************************");
        lista.sort(Comparator.comparing(Producto::getPrecio));
        System.out.println("Lista de productos comprados:");
        for (Producto item : lista) {
            System.out.println(item);
        }
        System.out.println("******************************************");
        System.out.println("Total a pagar: "+ tarjeta.getSaldo());
        System.out.println("Saldo disponible: "+ tarjeta.getLimite());
        System.out.println("Total de compras: "+ tarjeta.getCompras());
        sc.close();
    }
}
        

   
