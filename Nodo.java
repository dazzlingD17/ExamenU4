/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu4;

/**
 *
 * @author dazz
 */
public class Nodo {
     int dato,dato2;
    String nombre ,nombre2;
    Nodo hijoIzquierdo, hijoDerecho;
    public Nodo (int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoDerecho= null;
        this.hijoIzquierdo=null;
    }
    //muestra la informacion completa de nuestro objetos, o el valor de los atributos que quiera manejar
    public String toString(){
        return  nombre + "\n Su numero es: " + dato;
        
    }
     

    
}
