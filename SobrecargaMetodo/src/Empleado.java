/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SUAREZ
 */
public class Empleado {
    public String Nombre;
    public double Salario;

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }
  
    public double CalcularSalario(){
        return Salario;
    }
    public double CalcularSalarioExtra(int horas_extra){
        double Hora_ex=Salario+(horas_extra*23);
         return Hora_ex;
    }
    public double CalcularSalarioBono(int horas_extra, double bono){
        double Hora_ex=Salario+(horas_extra*23);
        double total_salario=Hora_ex+bono;
        return total_salario;
    }
}
