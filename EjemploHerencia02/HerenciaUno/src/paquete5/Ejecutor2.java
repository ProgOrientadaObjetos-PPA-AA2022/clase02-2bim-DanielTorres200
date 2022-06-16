/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author spart
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //1. crear y presentar un obj de tipo Estudiante Presencial,
        //con datoa por teclado
        
        System.out.println("Ingrese el nombre: ");
        String n = sc.nextLine();
        System.out.println("Ingrese el apellido");
        String ap = sc.nextLine();
        System.out.println("Ingrese la identificacion");
        String ced = sc.nextLine();
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de creditos");
        int numCreditos = sc.nextInt();
         System.out.println("Ingrese el costo de creditos");
        int costo = sc.nextInt();
    }
}
