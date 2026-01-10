/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] arg) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion3 = new int [3][3];
        String reporte = "";
        informacion3 = obtenerSuma(informacion, informacion2);
        System.out.printf("%s\n", reporte);
        obtenerReporte(informacion);
        obtenerReporte(informacion2);
        obtenerReporte(informacion3);
    }

    public static int[][] obtenerSuma(int[][] a, int[][] b) {
        int[][] info3 = new int[3][3];
        int suma;
        for(int i = 0; i < a.length;i++){
            suma = 0;
            for(int j = 0; j < a[i].length;j++){
                suma = a[i][j] + b[i][j]; 
                info3[i][j] = suma;
            }
        }
        return info3;
    }
    public static void obtenerReporte(int[][] arreglo1){
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
}
