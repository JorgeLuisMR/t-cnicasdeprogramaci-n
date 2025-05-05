/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SUAREZ
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("Jhair",1130);
        System.err.println("El empleado tiene como salario base: " +empleado.CalcularSalario());
        System.err.println("El empleado con horas extras: "+ empleado.CalcularSalarioExtra(4));
        System.err.println("El empleado con su salario con horas extras y bono: "+empleado.CalcularSalarioBono(4,200));
    }

}
