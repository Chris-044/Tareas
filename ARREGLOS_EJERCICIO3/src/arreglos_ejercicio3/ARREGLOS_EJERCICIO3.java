/*Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo y
a continuacion realizar la mediade los numero positivos, la media de los
negativos y contar el numero de ceros.
*/
package arreglos_ejercicio3;

import java.util.Scanner;
// @author christian
public class ARREGLOS_EJERCICIO3 {
    
    public static void main(String[] args) {
        System.out.println("EJERCICIO 3.");
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumapos=0, sumaneg=0, mediapos=0, medianeg=0;
        int conteopos=0, conteoneg=0, conteoceros=0;
        
        
        System.out.println("Guardando los numeros en el arreglo");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+".Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        
        if(numeros[i] == 0){
            conteoceros++;
        }
        else if(numeros[i] > 0){
            sumapos += numeros[i];
            conteopos++;       
        }
        else{
            sumaneg += numeros[i];
            conteoneg++;
        }
        }
            //Media de los positivos
            if(conteopos == 0){
                System.out.println("No se puede sacar la media de los numeros positivos");    
            }            
            else{
                mediapos = sumapos / conteopos;
                System.out.println("La media de los positivos es: "+mediapos);
            }
             //Media de los negativos
            if(conteoneg == 0){
                System.out.println("No se puede sacar la media de los numeros negativos");    
            }            
            else{
                medianeg = sumaneg / conteoneg;
                System.out.println("La media de los negativos es: "+medianeg);
            }
            System.out.println("La cantidad de ceros es: "+conteoceros);
        }               
    }    

