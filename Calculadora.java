import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora{
    double numero1;
    double numero2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("¿Que operación quiere realizar? (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        Calculadora calculadora = new Calculadora(numero1, numero2);
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = calculadora.suma();
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);
                break;
            case '-':
                resultado = calculadora.resta();
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);
                break;
            case '*':
                resultado = calculadora.multiplicacion();
                JOptionPane.showMessageDialog(null, "El resultado de la multiplocación es: " + resultado, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);
                break;
            case '/':
                resultado = calculadora.divicion();
                JOptionPane.showMessageDialog(null, "El resultado de la divición es: " + resultado, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No puedo realizar esta operación", "ERROR", JOptionPane.WARNING_MESSAGE );
                System.exit(0);
        }
    }
    
    Calculadora(double a, double b) {
        numero1 = a;
        numero2 = b;
    }

    double suma() {
        return numero1 + numero2;
    }

    double resta() {
        return numero1 - numero2;
    }

    double multiplicacion() {
        return numero1 * numero2;
    }

    double divicion() {
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "No es posible realizar esta acción");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }


}