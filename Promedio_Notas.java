import java.util.Scanner; // Para el teclado

public class Promedio_Notas {
    public static void main(String[] args) {
        // Creamos el lector
        Scanner leer = new Scanner(System.in);
        
        // Variables para los 3 números y el resultado
        double n1, n2, n3, promedio;
        
        System.out.println("--- Calculo de Promedio ---");
        
        // Pedimos los tres datos
        System.out.print("Ingresa el primer numero: ");
        n1 = leer.nextDouble();
        
        System.out.print("Ingresa el segundo numero: ");
        n2 = leer.nextDouble();
        
        System.out.print("Ingresa el tercer numero: ");
        n3 = leer.nextDouble();
        
        // Calculamos el promedio (NOTA:Es importante el parentecis sin este falla el calculo)
        promedio = (n1 + n2 + n3) / 3;
        
        // Resultado
        System.out.println("El promedio final es: " + promedio);
        
        leer.close(); // Cerramos el lector
    }
}