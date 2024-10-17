package org.example.relacion5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ejercicio15 {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Boolean continuidad = true;
        while(continuidad){
            System.out.println("¿Cuántos son?(Introduzca -1 para salir del programa)");
            int opcion = sc.nextInt();
            if(opcion == -1){
                continuidad = false;
            }    else if(opcion >=0 ){
                reparticionMesas(opcion);
            } else {
                System.out.println("Introduzca una opcion valida");
            }

        }
    }

    public static void reparticionMesas(Integer grupoDeGente){
        var mesas = new ArrayList<Integer>();
        Random genteEnLaMesa = new Random();

        for(int i = 0; i<=10;i++){
            mesas.add(genteEnLaMesa.nextInt(5));// devuelve un número entre 0 y 4
        }

       if(grupoDeGente <= 4){
           Integer mesaLibre = mesas.indexOf(0);
           if (mesaLibre == -1) {

               for (int i = 0; i < mesas.size(); i++) {
                   int ocupacionActual = mesas.get(i);
                   if (ocupacionActual + grupoDeGente <= 4) {  // Verifica si cabe el grupo
                       mesas.set(i, ocupacionActual + grupoDeGente);  // Actualiza la mesa
                       break;  // Sal del bucle una vez que se ha colocado el grupo
                   }
               }
           } else {
               // Si hay una mesa vacía, asigna directamente el grupo a esa mesa
               mesas.set(mesaLibre, grupoDeGente);
           }
       } else {
           System.out.println(" “Lo siento, no admitimos grupos de 6," +
                   "haga un grupo de 4 e intentelo de nuevo”");
       }
    }

    public static void main(String[] args) {
        menu();
    }
}
