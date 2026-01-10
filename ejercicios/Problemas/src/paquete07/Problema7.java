/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] arg) {
        String[] ciudades = obtenerCiudades();
        mostrarInformacion(ciudades);

    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        int numeroC;
        String ciudad;
        System.out.println("Ingrese el numero de ciudades a ingresar: ");
        numeroC = entrada.nextInt();
        entrada.nextLine();
        String[] ciudadesI = new String[numeroC];
        for (int i = 0; i < ciudadesI.length; i++) {
            System.out.println("Ingresa el nombre de la ciudad: ");
            ciudad = entrada.nextLine();
            ciudadesI[i] = ciudad;

        }
        return ciudadesI;
    }

    public static void mostrarInformacion(String[] arreglo) {
        String reporteFinal = "";
        int numeroCiudades = 0;
        String ciudad;
        for (int i = 0; i < arreglo.length; i++) {
            ciudad = arreglo[i];
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                numeroCiudades = numeroCiudades + 1;
                reporteFinal = String.format("%s%s\t", reporteFinal, ciudad);
            }
            if (numeroCiudades == 0) {
                reporteFinal = String.format("No existen ciudades que cumplan"
                        + "la condicion\n");
            }

        }

        System.out.printf("\n%s\n",
                reporteFinal);
    }
}
