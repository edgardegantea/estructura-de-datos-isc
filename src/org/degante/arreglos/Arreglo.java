package org.degante.arreglos;

import java.util.Arrays;

public class Arreglo {
    
    private static int[] numeros = {1, 9, -8, 7};
    private static String[] nombres = {"Juan", "Peter", "María"};

    public void listarArreglo() {
        System.out.println("Listar Arreglo con foreach");

        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
    }


    public void listarArregloConForI() {
        System.out.println("\n\nListar Arreglo con for normal");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "");
        }
    }


    public void sumarElementosDeArreglo() {
        System.out.println("\n\nSumar los elementos de un arreglo");

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = numeros[i] + suma;
        }

        System.out.println("Suma de todos los elementos del arreglo: " + suma);
    }


    public void elementoMayor() {
        System.out.println("\n\nImprimir el elemento más grande del arreglo");

        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }



    public void elementoMenor() {
        System.out.println("\n\nImprimir el elemento más pequeño del arreglo");

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número menor es: " + menor);
    }


    public void invertirArreglo() {
        System.out.println("\n\nInvertir elementos del arreglo");
        System.out.println("\nArreglo original: ");

        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }

        for (int i = 0; i < numeros.length/2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - i -1 ] = temporal;
        }

        System.out.println("\nArreglo invertido: ");
        
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }

        System.out.println("\n\n");
    }


    public void ordenarArreglo() {                          // O(n²)  
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temporal = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temporal;
                }
            }
        }

        System.out.println("Arreglo ordenado en forma ascendente: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }  
    }


}
