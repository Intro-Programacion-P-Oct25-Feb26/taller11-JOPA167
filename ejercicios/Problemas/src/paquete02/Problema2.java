/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombreViviendas = new String[10];
        int[][] consumoEnergeticoR = new int[10][12];
        int[] sumaConsumo = new int[10];

        nombreViviendas = obtenerNombre();
        consumoEnergeticoR = obtenerConsumo();
        sumaConsumo = obtenerSuma(consumoEnergeticoR);
        procedimientoFinal(nombreViviendas, sumaConsumo);
    }

    public static String[] obtenerNombre() {
        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[10];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese nombre de la vivienda: ");
            nombres[i] = entrada.nextLine();
        }
        return nombres;
    }

    public static int[][] obtenerConsumo() {
        Scanner entrada = new Scanner(System.in);

        int[][] consumo = new int[10][12];
        for (int i = 0; i < consumo.length; i++) {
            for (int c = 0; c < consumo[i].length; c++) {
                System.out.printf("Ingrese consumo energético de la vivienda %d"
                        + " en el mes %d: ", i + 1, c + 1);
                consumo[i][c] = entrada.nextInt();
            }
        }
        return consumo;
    }

    public static int[] obtenerSuma(int[][] a) {

        int[] sumas = new int[10];
        int suma;
        for (int i = 0; i < a.length; i++) {
            suma = 0;
            for (int c = 0; c < a[i].length; c++) {
                suma = suma + a[i][c];
            }
            sumas[i] = suma;
        }
        return sumas;
    }

    public static void procedimientoFinal(String[] a, int[] b) {

        String mensajeFinal = "";
        for (int i = 0; i < a.length; i++) {
            mensajeFinal = String.format("%sLa vivienda de nombre %s consumió "
                    + "anualmente %d\n",
                    mensajeFinal, a[i], b[i]);
        }
        System.out.printf("%s\n", mensajeFinal);
    }
}

