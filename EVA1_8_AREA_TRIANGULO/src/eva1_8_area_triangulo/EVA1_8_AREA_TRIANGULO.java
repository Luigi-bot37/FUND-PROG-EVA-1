/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///1.DECLARACION
        Scanner captura = new Scanner(System.in);
        double area; //Double: NUMEROS CON PARTE DECIMAL
        double base;
        double altura;
        System.out.println("Ingrese la base del triangulo:");
        base = captura.nextDouble();
        System.out.println("Ingrese la altura del triangulo:");
        altura = captura.nextDouble();

//2.ASIGNACION
        area = (base * altura) / 2;
        System.out.println("El area es:");
        System.out.println(area);
    }

}
