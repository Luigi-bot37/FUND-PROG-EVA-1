package javaapplication58;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.DECLARACION DE VARIABLES
        Scanner captura = new Scanner(System.in);
        String apellidos;
        String nombre;
        int semestre;
//; fin de instrcion en Java
//2.CAPTURA
        System.out.println("Inrese su nombre:");
        apellidos = captura.nextLine();
        System.out.println("Ingrese su apellido");
        nombre = captura.nextLine();
        System.out.println("Ingrese su semestre");
        semestre = captura.nextInt();
//Java reconoce mayusculas y minusculas
//Java pide comillas para distinguir cadenas de texto 
//3.MOSTRAR SALIDAS
        System.out.println(apellidos);
        System.out.println(nombre);
        System.out.println(semestre);
    }

}
