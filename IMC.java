
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // double porque el peso y la altura llevan decimales
        double peso, altura, imc;
        
        System.out.println("--- Calculo de IMC ---");
        
        // Datos
        System.out.print("Introduce tu peso en kg : ");
        peso = teclado.nextDouble();
        
        System.out.print("Introduce tu altura en metros con punto decimal : ");
        altura = teclado.nextDouble();
        
        // Calculamos el IMC: peso dividido entre (altura por altura)
        imc = peso / (altura * altura);
        
        // Resultado
        System.out.println("Tu Indice de Masa Corporal es: " + imc);
        
        teclado.close();
    }
}