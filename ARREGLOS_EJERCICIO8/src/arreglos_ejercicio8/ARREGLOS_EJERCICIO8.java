/*Ejercicio 8: Diseñar una aplicacion que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 numeros.Despues se debe pedir un numero y una posicion
insertarlo en la posicion indicada desplazando los que esten detras.*/
 
package arreglos_ejercicio8;
//@author christian

import java.util.Scanner;

public class ARREGLOS_EJERCICIO8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero,posicion;
        
        System.out.println("Llenamos el arreglo");
        for(int i=0; i<8; i++){
            System.out.print((i)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("\nDigite un numero: ");
        numero = entrada.nextInt();
        System.out.println("Digite una posicion: ");
        posicion = entrada.nextInt();
        
        for(int i=7; i>=posicion; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[posicion] = numero;
        System.out.println("El nuevo arreglo es: ");
        for(int i=0; i<9; i++){
            System.out.println("Posicion "+i+": "+arreglo[i]);
        }
        
    }
    
}
