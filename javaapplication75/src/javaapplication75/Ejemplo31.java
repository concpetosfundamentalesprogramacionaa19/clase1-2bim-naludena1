/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Random aleatorios = new Random();
        double nota;
        int numNotas;
        int[] datos = new int[6]; // Declaracion del arreglo
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-adelante"}; // Rangos del arreglo

        System.out.println("Ingrese el número de notas que desea ingresar");
        numNotas = entrada.nextInt(); // Entrada de datos

        for (int notas = 0; notas < numNotas; notas++) { 
            System.out.println("Ingrese la nota del estudiante"); // Ingreso y validacion de notas
            nota = entrada.nextDouble();

            if (nota <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                
                if (nota >= 8.1 && nota <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    
                    if (nota >= 12.1 && nota <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        
                        if (nota >= 16.1 && nota <= 19) {
                            datos[3] = datos[3] + 1;

                        } else {
                            
                            if (nota >= 19.1 && nota <= 20) {
                                datos[4] = datos[4] + 1;

                            } else {
                                
                                if (nota >= 20.1 && nota <= 1000) {
                                    datos[5] = datos[5] + 1;

                                }
                            }
                        }
                    }

                }
            }

        }

        System.out.println("Notas Ingresadas");
        System.out.println("Rangos:");

        for (int i = 0; i < datos.length; i++) { 
            System.out.printf("%s = %d\n", rangos[i], datos[i]); // Salida de datos
        }

    }
}
