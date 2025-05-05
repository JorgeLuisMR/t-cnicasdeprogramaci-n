/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejo.errores;
import java.util.Scanner;
public class ManejoErrores {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        try{
            System.out.println("Ingresa un numero entero: ");
            int numero=Integer.parseInt(teclado.nextLine());
            System.out.println("El numero ingresado fue: "+numero);
        }catch(NumberFormatException e){
            System.err.println("El valor ingresado no era un numero entero valido");
        }
    }
}
