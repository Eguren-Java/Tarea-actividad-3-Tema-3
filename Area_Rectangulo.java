import java.util.Scanner; // Sirve para que el programa reconozca el teclado

public class Area_Rectangulo {
    public static void main(String[] args) {
        // Definimos el objeto para leer los datos
        Scanner leer = new Scanner(System.in);
        
        // Declaramos las variables
        double base, altura, resultado;
        
        System.out.println("--- Programa para calcular el area ---");
        
        // Pedimos los datos al usuario
        System.out.print("Dime cuanto mide la base: ");
        base = leer.nextDouble();
        
        System.out.print("Dime cuanto mide la altura: ");
        altura = leer.nextDouble();
        
        // Hacemos la operacion matematica
        resultado = base * altura;
        
        // Mostramos el resultado final
        System.out.println("El area total del rectangulo es: " + resultado);
        
        leer.close(); // Cerramos el lector 
    }
}