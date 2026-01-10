/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main (String[] arg){
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacion;
        media = obtenerMedia(informacion);
        desviacion = obtenerDesviacion(informacion,media);
        System.out.printf("La Media Aritemética del arreglo es: %.0f\n"
                + "La Desviacion Estandar del arreglo es: %.2f\n",media,desviacion);
        
        
    }
    public static double obtenerMedia (int[]arreglo){
        double suma =0;
        for(int i =0; i<arreglo.length;i++){
            suma = suma + arreglo[i];
        }
        return suma;
    }
    public static double obtenerDesviacion (int[]arreglo,double media){
        double operacion =0;
        double total;
        for(int i =0; i<arreglo.length;i++){
            operacion = operacion + Math.pow(arreglo[i]-media,2);
        }
        total = Math.sqrt(operacion/9);
        return total;
    }
}
