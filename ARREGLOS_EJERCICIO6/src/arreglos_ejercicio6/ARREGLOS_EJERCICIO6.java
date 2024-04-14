/*Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos 
numericos, y mezclarlos en una tercera de la forma: 3 de la tabla de A, 3 de la 
tabla B, otros 3 de A, otros 3 de la B, etc.
*/
package arreglos_ejercicio6;

// @author christian

import java.util.Scanner;

public class ARREGLOS_EJERCICIO6 {

    public static void main(String[] args) {
        System.out.println("EJERCICIO 6");
        
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Digite el primer arreglo: ");
        for(i=0; i<12; i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println("\nDigite el segundo arreglo: ");
        for(i=0; i<12; i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
    }
        i=0;
        j=0;
        while(i<12){
            for(int k=0; k<3; k++){
                c[j] = a[i+k];
                j++;
            }
          for(int k=0; k<3; k++){
                c[j] = b[i+k];
                j++;   
        }
          i+=3;
        }
        System.out.print("El arreglo resultante es: ");
        for(i=0; i<24; i++){
            System.out.print(c[i]+" - ");
        }
        System.out.println();
        
    }
}

    

