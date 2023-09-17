package application;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
