/*Actividad Desarrollo de SoftwareI.
 Actividad Propuesta por el ingeniero Cristian Cuadrado (realizar una libreria que me realize 3 funciones especificas).
 Esta libreria lo que hace es calcular tanto la suma, como el promedio y la mediana de una lista de numeros
 actuando asi como una calculadora.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Libreria {
    
    // Función para calcular la suma de la lista de números

    public static double calcularSuma(List<Double> numeros) {

        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }
    // Función para calcular el promedio de la lista de números

    public static double calcularPromedio(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista de números está vacía");
        }
           // Calcular la suma y dividirla por la cantidad de números
        return calcularSuma(numeros) / numeros.size();
    }
    // Función para calcular la mediana de la lista de nuemeros 

    public static double calcularMediana(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista de números está vacía");
        }
        Collections.sort(numeros);
        int tamaño = numeros.size();
         // Calcular la mediana dependiendo si la cantidad de números es par o impar
        if (tamaño % 2 == 0) {
            int indice1 = tamaño / 2 - 1;
            int indice2 = tamaño / 2;
            return (numeros.get(indice1) + numeros.get(indice2)) / 2;
        } else {
            return numeros.get(tamaño / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

          // Solicitamos al usuario que ingrese los números
          //una vez el usuario haya puesto los numeros a calcular, debera poner "fin" para tener sus resultados 

        System.out.println("Ingrese La Lista De Numeros");
       // Leemos los numeros 

        while (scanner.hasNextDouble()) {
            numeros.add(scanner.nextDouble());
        }
        
         // por ultimo mostramos los resultados

        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Promedio: " + calcularPromedio(numeros));
        System.out.println("Mediana: " + calcularMediana(numeros));
        
        scanner.close();
    }
}
