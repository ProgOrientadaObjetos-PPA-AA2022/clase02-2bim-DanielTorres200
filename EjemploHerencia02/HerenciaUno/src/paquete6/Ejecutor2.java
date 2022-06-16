/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author spart
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //Ingresar estudiante de tipo presencial por teclado
        //El usuario decide caundo terminar
        // No utilizar super.toString en estudiantePresencial
        // Debe existi 1 sola impresion de todos los estudiantea presenciales
        //No usar arreglos

        //Trabajo clases 16 junio 2022
        String cadena = "";
        String a = "";
        System.out.println("EstudientesPresencial");
        do {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el apellido del estudiante: ");
            String apellido = sc.nextLine();
            System.out.print("Ingrese la identificacion del estudiante: ");
            String identificacion = sc.nextLine();
            System.out.print("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el numero de creditos del estudiante: ");
            int numCreditos = sc.nextInt();
            System.out.print("Ingrese el costo del credito del estudiante: ");
            double costoCred = sc.nextDouble();
            System.out.println("");

            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, numCreditos, costoCred);

            estPresencial.calcularMatriculaPresencial();

            System.out.println("Desea ingresar más estudiantes. \nIngrese la letra"
                    + " P para continuar");
            sc.nextLine();
            a = sc.nextLine();
            cadena = String.format("%s%s\n", cadena, estPresencial);

        } while (a.equals("P"));
        System.out.println(cadena);
    }

}
