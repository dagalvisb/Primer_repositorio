import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
    double numero1, numero2;

    Calculadora(double a, double b) {
        numero1 = a;
        numero2 = b;
    }

    double sumar() {
        return numero1 + numero2;
    }

    double restar() {
        return numero1 - numero2;
    }

    double multiplicar() {
        return numero1 * numero2;
    }

    double dividir() {
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese la operacion a realizar (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        Calculadora calculadora = new Calculadora(numero1, numero2);
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = calculadora.sumar();
                break;
            case '-':
                resultado = calculadora.restar();
                break;
            case '*':
                resultado = calculadora.multiplicar();
                break;
            case '/':
                resultado = calculadora.dividir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida", "ERROR", JOptionPane.INFORMATION_MESSAGE );
                System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);
    }
}