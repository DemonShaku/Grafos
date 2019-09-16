/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           Scanner teclado=new Scanner(System.in);
        int op1=0;
           do{            
        System.out.println("Seleccione un modelo");
        System.out.println("Modelo de Erdös y Rényi: 1");
          
        System.out.println("Modelo de Gilbert: 2");
               
        System.out.println("Modelo Geografico simple: 3");
               
        System.out.println("Modelo Barabási-Albert: 4");
               
        System.out.println("Generar ejemplos por default (30,100,500): 5");
               
        System.out.println("Salir: 6");
        System.out.println();
       op1=Integer.parseInt(teclado.next());
       
       
switch(op1){
         
        
    case 1:
               int er = 0; 
               int er1 = 0;
        System.out.println("Introdusza el numero de Nodos"); 
        er=Integer.parseInt(teclado.next()); 
        Grafo uno = new Grafo(er);//numero de nodos
        System.out.println("Introduzca el numero de Aristas");
        er1=Integer.parseInt(teclado.next()); 
        uno.modeloER(er1); //número de aristas
        uno.escribirArchivo("Grafo-ER"+er+".gv");
       break;

       
    case 2: 
        int gl=0;
        System.out.println("Introdusza el numero de Nodos"); 
        gl=Integer.parseInt(teclado.next()); 
        Grafo dos = new Grafo(gl);//numero de nodos
        dos.modeloGilbert(0.25); //prob
        dos.escribirArchivo("Grafo-Gilbert"+gl+".gv");
        break;
        
    case 3:
        int geo=0;
        System.out.println("Introdusza el numero de Nodos"); 
        geo=Integer.parseInt(teclado.next()); 
        Grafo tres = new Grafo(geo, "geo");//numero de nodos
        tres.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        tres.escribirArchivo("Grafo-Geo"+geo+".gv");
        break;
        
    case 4: 
        int ba=0,d=0;
        System.out.println("Introdusza el numero de Nodos"); 
        ba=Integer.parseInt(teclado.next()); 
        Grafo cuatro = new Grafo(ba);//numero de nodos
        System.out.println("Introdusza para D"); 
        d=Integer.parseInt(teclado.next()); 
        cuatro.modeloBA(d); //parámetro 'd' del modelo
        cuatro.escribirArchivo("Grafo-BA"+ba+".gv");
        break;
    case 5:
        Grafo cinco = new Grafo(30);//numero de nodos
        cinco.modeloER(10); //número de aristas
        cinco.escribirArchivo("Grafo-ER-30.gv");
        Grafo seis = new Grafo(100);//numero de nodos
        seis.modeloER(50); //número de aristas
        seis.escribirArchivo("Grafo-ER-100.gv");
        Grafo siete = new Grafo(500);//numero de nodos
        siete.modeloER(100); //número de aristas
        siete.escribirArchivo("Grafo-ER-500.gv");

        Grafo ocho = new Grafo(30);//numero de nodos
        ocho.modeloGilbert(0.25); //número de aristas
        ocho.escribirArchivo("Grafo-Gilbert-30.gv");
        Grafo nueve = new Grafo(100);//numero de nodos
        nueve.modeloGilbert(0.25); //número de aristas
        nueve.escribirArchivo("Grafo-Gilbert-100.gv");
        Grafo dies = new Grafo(500);//numero de nodos
        dies.modeloGilbert(0.25); //número de aristas
        dies.escribirArchivo("Grafo-Gilbert-500.gv");
        
        
        Grafo once = new Grafo(30, "geo");//numero de nodos
        once.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        once.escribirArchivo("Grafo-Geo-30.gv");
        Grafo doce = new Grafo(100, "geo");//numero de nodos
        doce.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        doce.escribirArchivo("Grafo-Geo-100.gv");
        Grafo trece = new Grafo(500, "geo");//numero de nodos
        trece.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        trece.escribirArchivo("Grafo-Geo-500.gv");
       
        Grafo catorce = new Grafo(30);//numero de nodos
        catorce.modeloBA(10); //parámetro 'd' del modelo
        catorce.escribirArchivo("Grafo-BA-30.gv");
        Grafo quince = new Grafo(100);//numero de nodos
        quince.modeloBA(75); //parámetro 'd' del modelo
        quince.escribirArchivo("Grafo-BA-100.gv");
        Grafo diesiseis = new Grafo(500);//numero de nodos
        diesiseis.modeloBA(250); //parámetro 'd' del modelo
        diesiseis.escribirArchivo("Grafo-BA-500.gv");
        
        break;
        }
    

    }while (op1!=6); 
           
    }
}
