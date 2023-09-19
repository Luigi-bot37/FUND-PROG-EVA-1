/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tipos_datos;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte calif;
        calif = 127;
        // calif=190;
        calif = -128;
        // califa=-129;
        // calif=127+1;
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1); 
//Al superar el limite del dato, se reinicia a su valor permitido minimo
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        //-------
        char caracter = 'A';
        System.out.println(caracter + 0);//convierte de char a entero
    }

}
