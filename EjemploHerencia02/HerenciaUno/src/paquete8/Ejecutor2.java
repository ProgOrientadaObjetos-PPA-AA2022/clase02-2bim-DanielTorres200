/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;
/**
 *
 * @author spart
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        EstudiantePresencial estPresencial = new EstudiantePresencial("Daniel", "Torres",
                "1150331963", 1200, 5, 200);
         estPresencial.calcularMatriculaDistancia();
         System.out.println(estPresencial);
    }
}
