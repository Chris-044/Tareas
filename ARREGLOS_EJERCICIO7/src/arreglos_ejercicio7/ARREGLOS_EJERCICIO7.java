/*Ejercicio 7:Leer por teclado una serie de 10 numeros enteros. La aplicacion debe
indicarnos si los numeros estan ordenados de forma creciente, decreciente, o si
estan desordenados*/
package arreglos_ejercicio7;

import java.util.Scanner;

/*@author christian*/
public class ARREGLOS_EJERCICIO7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=false, decreciente=false;
        System.out.println("EJERCICIO 7");
        
        System.out.println("Llenar el arreglo");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        for(int i=0; i<9; i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }
             if(creciente==true && decreciente==false){
                 System.out.println("\nEl arreglo esta de forma creciente");
             }   
             else if(creciente==false && decreciente==true){
                 System.out.println("\nEl arreglo esta de forma decreciente");
             }
             else if(creciente==true && decreciente==true){
                 System.out.println("\nEl arreglo esta desordenado");
             }
             else if(creciente==false && decreciente==false){
                 System.out.println("\nTodos los numeros del arreglo son iguales");
             }
             
        
    }
    
    
}
