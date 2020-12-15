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
public class Arbolbin {
        Nodo raiz;
    
    public Arbolbin (){
        raiz=null;
    }
    //metodo para insertar un Nodo en el arbol
    public void agregarNodo(int d, String nom){
        Nodo nuevo= new Nodo (d,nom);
        if(raiz== null){
            raiz=nuevo;
        }
        else {
            Nodo auxiliar= raiz;
            Nodo padre;
            while(true){
                padre=auxiliar;
                if(d< auxiliar.dato){
                    auxiliar= auxiliar.hijoIzquierdo;
                    if(auxiliar== null){
                        padre.hijoIzquierdo= nuevo;
                        return;
                    }
                }
                else {
                    auxiliar=auxiliar.hijoDerecho;
                    if (auxiliar== null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio (){
        return raiz==null;
    }
    //metodo para recorrer el Arbol inOrden
    public void inOrden(Nodo r){
        if (r!= null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ",");
            inOrden(r.hijoDerecho); 
        }
    }
    //Metodo para recorrer el Arbol en preorden
    public void preOrden(Nodo r){
        if (r!= null){
            System.out.print(r.dato + ",");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho); 
        }
    }
    //metodo para recorrer el Arbol postOrden
     public void postOrden(Nodo r){
        if (r!= null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho); 
            System.out.print(r.dato + ",");
        }
     }
     
     
     public void agregarNodo2(int d, String nom){
        Nodo nuevo= new Nodo (d,nom);
        if(raiz== null){
            raiz=nuevo;
        }
        else {
            Nodo auxiliar= raiz;
            Nodo padre;
            while(true){
                padre=auxiliar;
                if(d< auxiliar.dato){
                    auxiliar= auxiliar.hijoDerecho;
                    if(auxiliar== null){
                        padre.hijoDerecho= nuevo;
                        return;
                    }
                }
                else {
                    auxiliar=auxiliar.hijoIzquierdo;
                    if (auxiliar== null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio2 (){
        return raiz==null;
    }
    //metodo para recorrer el Arbol inOrden
    public void inOrden2(Nodo r){
        if (r!= null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ",");
            inOrden(r.hijoDerecho); 
        }
    }
    //Metodo para recorrer el Arbol en preorden
    public void preOrden2(Nodo r){
        if (r!= null){
            System.out.print(r.dato + ",");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho); 
        }
    }
    //metodo para recorrer el Arbol postOrden
     public void postOrden2(Nodo r){
        if (r!= null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho); 
            System.out.print(r.dato + ",");
        }
     }

    
}
