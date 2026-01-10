/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        String cedula;
        System.out.println("Ingrese la opcion que desea utilizar:1. Calcular Valor"
                + "Luz 2.Calcular Predio");
        opcion = entrada.nextInt();
        if (opcion>0 & opcion <=3){
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula: ");
            cedula = entrada.nextLine();
            switch (opcion){
                case 1:
                    calcularValorLuz(nombre,cedula);
                    break;
                case 2:
                    calcularPredio(nombre,cedula);
                    break;
                
            }
        }else{
            System.out.println("LA OPCIÓN INGRESADA NO ES COMPATIBLE");
        }
    }
    public static String calcularValorLuz(String n,String c){
        Scanner entrada = new Scanner(System.in);
        double valorK;
        int numeroK;
        double total;
        String reporte;
        System.out.println("Ingrese el valor del kilowatio: ");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el número de kilowatio: ");
        numeroK = entrada.nextInt();
        total = valorK * numeroK;
        reporte = String.format("Cliente %s con cédula %s debe cancelar el valor"
                + " de %.2f",n,c,total);
        return reporte;
        
    }
    public static String calcularPredio(String n,String c){
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double predio = 0.02;
        double total;
        String reporte;
        System.out.println("Ingrese el valor del inmueble: ");
        valorInmueble = entrada.nextDouble();  
        total = valorInmueble * predio;
        reporte = String.format("Cliente %s con cédula %s  tiene un bien inmueble"
                + " valorado en %s $ y tiene que pagar de predio %.2f $.",n,
                c,valorInmueble,total);
        return reporte;
        
    }
    
    
}
