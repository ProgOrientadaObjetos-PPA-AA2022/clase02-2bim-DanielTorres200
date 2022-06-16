/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author spart
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // crar y presentar un objeto del tipo Estudiante Presencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(15);
        estPresencial.establecerCostoCredito(2);
        estPresencial.calcularMatriculaPresencial();
    }
}
