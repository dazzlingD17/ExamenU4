/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu4;

import java.util.Scanner;

/**
 *
 * @author dazz
 */
public class ExamenU4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);  
   boolean menu= true;
   int elemento;
   String nombre;
   Arbolbin arbolito =new Arbolbin();
        while (menu ){
                 System.out.println("ingresa el numero del nodo");
                 elemento=leer.nextInt();
                  System.out.println("ingresa el nombre del nodo");
                  nombre=leer.next();
                  arbolito.agregarNodo(elemento,nombre);
                  System.out.println("¿Deseas agregar otro nodo? [1] SI [2] NO");
                  int opc=leer.nextInt();
                  if (opc== 2){
                      menu= false;
                  }
                        } 
        
                  
        System.out.println("-----DATOS DEL ARBOL BINARIO ORIGINAL-----");
        System.out.print("In-Orden:");
        if(!arbolito.estaVacio()){
                    
                    arbolito.inOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
                
        System.out.print("Pre-Orden:");
        if(!arbolito.estaVacio()){
                  
                    arbolito.preOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
        
        System.out.print("Post-Orden:");
         if(!arbolito.estaVacio()){
               
                    arbolito.postOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
          System.out.println("-----DATOS DEL ARBOL BINARIO ESPEJO-----");
             System.out.print("In-Orden:");
        if(!arbolito.estaVacio()){
                    
                    arbolito.inOrden2(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
                
        System.out.print("Pre-Orden:");
        if(!arbolito.estaVacio()){
                  
                    arbolito.preOrden2(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
        
        System.out.print("Post-Orden:");
         if(!arbolito.estaVacio()){
               
                    arbolito.postOrden2(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
         
    }
    
}
