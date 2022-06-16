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
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        
        System.out.print("Ingrese el nombre del Estudiante: ");
        String nombre = leer.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese el apellido del Estudiante: ");
        String apellido = leer.nextLine();
        System.out.println("");
        System.out.print("Ingrese la identificacion del Estudiante: ");
        String identificacion = leer.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese la edad del Estudiante: ");
        int edad = leer.nextInt();
        System.out.println("");
        
        System.out.print("Ingrese el numero de creditos del Estudiante: ");
        int numeroCreditos = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese el costo de los creditos: ");
        double costoCreditos = leer.nextDouble();
        System.out.println("");
        
        
        EstudiantePresencial ep = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numeroCreditos, costoCreditos);
        ep.calcularMatriculaPresencial();
        
        
        System.out.println(ep);
    }
}
