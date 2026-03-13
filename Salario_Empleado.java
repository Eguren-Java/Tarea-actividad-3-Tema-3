import java.util.Scanner;

public class Salario_Empleado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Variables del problema
        double sueldoBruto, porcentajeImpuesto, deducciones, impuestoTotal, sueldoNeto;
        
        System.out.println("--- Calculo de Salario Neto ---");
        
        // Datos uno por uno
        System.out.print("Escribe el sueldo bruto: ");
        sueldoBruto = leer.nextDouble();
        
        System.out.print("¿Cual es el porcentaje de impuestos? : ");
        porcentajeImpuesto = leer.nextDouble();
        
        System.out.print("Escribe el total de deducciones extras: ");
        deducciones = leer.nextDouble();
        
        // Fórmulas que dio la maestra
        // Impuesto = (Salario Bruto) * (Porcentaje / 100)
        impuestoTotal = sueldoBruto * (porcentajeImpuesto / 100);
        
        // Salario Neto = Salario Bruto - Impuesto - Deducciones
        sueldoNeto = sueldoBruto - impuestoTotal - deducciones;
        
        // Resultado final
        System.out.println("El sueldo neto final es de: " + sueldoNeto);
        
       leer.close();
    }
}