/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseoptimizacion;

/**
 * 
 * @author VivianaM
 */
 import java.util.Scanner;
 
 
public class main {
    
    static int tamaño = 150;
    
    public static void main(String[] args) {
        int[] numeros = new int[tamaño];
        llenaNumero(numeros);
        Scanner leer = new Scanner(System.in);
        boolean existe= false;
                
        System.out.println("Ingrese el número a buscar!");
        int numBuscado = leer.nextInt();
         
        for(int b = 0; b < numeros.length; b++){
             
            if(numeros[b]==numBuscado){
                 
                System.out.println("El numero si existe, en la posicion: "+(b+1));
                break;
            }
            if(b == numeros.length-1){
                existe = true;
            }
        }       
        if(existe==true){
             
            System.out.println("El numero no existe");
        }
    }
    public static int[] llenaNumero(int[] numeros){
	System.out.println("LLenando matriz....");
	for(int i=0;i<numeros.length;i++){
            numeros[i] = i+1;
        }
        return numeros;
    }
}

