/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opcion que desea utilizar:1. Área del "
                + "cuadrado 2.Área del triángulo 3.Área del rectángulo ");
        opcion = entrada.nextInt();
        if (opcion>0 & opcion <=3){
            switch (opcion){
                case 1:
                    obtenerAreaCuadrado();
                    break;
                case 2:
                    obtenerAreaTriangulo();
                    break;
                case 3:
                    obtenerAreaRectangulo();
                    break;
            }
        }else{
            System.out.println("LA OPCIÓN INGRESADA NO ES COMPATIBLE");
        }
    }
    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        int operacion;
        String reporte;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextInt();
        operacion = lado * lado;
        reporte = String.format("El area del cuadrado de lado %d es: %d",lado,
                operacion);
        System.out.printf("%s\n",reporte);
        
    }
    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        double operacion;
        String reporte;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextInt();
        operacion = (base * altura)/2;
        reporte = String.format("El area del triangulo de base %d y lado% d "
                + "es: %.2f",base,altura,operacion);
        System.out.printf("%s\n",reporte);
        
    }
    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int operacion;
        String reporte;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextInt();
        operacion = base * altura;
        reporte = String.format("El area del triangulo de base %d y lado% d "
                + "es: %d",base,altura,operacion);
        System.out.printf("%s\n",reporte);
        
    }
}
