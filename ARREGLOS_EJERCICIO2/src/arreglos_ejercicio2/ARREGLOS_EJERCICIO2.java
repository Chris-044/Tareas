package arreglos_ejercicio2;

//@author christian

import java.util.Scanner;

public class ARREGLOS_EJERCICIO2 {
    
    public static void main(String[] args) {
        
/*Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el
orden inverso al introducido.*/
 Scanner entrada = new Scanner(System.in );
 float numero[] = new float[5];
        System.out.println("Ejercicio 2");
 
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un numero: ");
            numero[i] = entrada.nextFloat();            
        }
        System.out.println("\nImprimir los elementos del arreglo en orden inverso");
        for(int i=4; i>=0; i--){
            System.out.println(numero[i]);
        }

    }
    
}
