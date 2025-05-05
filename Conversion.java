import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa un numero entero: ");
            String N = teclado.nextLine();
            
            int numero = Integer.parseInt(N);
            
            System.out.println("El NUMERO INGRESADO ES : "+ numero);
        }catch (NumberFormatException e){
            System.out.println("Error: Ingrese correctamente lo solicitado");
        }catch (Exception e){
             System.out.println("Error"+ e.getMessage());
        }finally {
                teclado.close();
        }
    }
}
