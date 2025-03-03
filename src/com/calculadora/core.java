package com.calculadora;

import com.calculadora.ExecutingOperations.Calculator;
import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        while (true) {
            Calculator calculator = new Calculator(); // instanciando a classe que soma os valores
            Scanner scanner = new Scanner(System.in);
            System.out.println("----/---- CALCULADORA EM JAVA -----/-----");
            System.out.println("Digite o Primeiro Número:");
            int FirstNumber = scanner.nextInt();
            System.out.println("Digite o Segundo Número:");
            int SecondNumber = scanner.nextInt();
            System.out.println("Digite a Operação que deseja --> + (Soma) - (Subtrair) * (multiplicação) / (divisão)");
            String UserOperation = scanner.next();
            int result = calculator.executeMathOperation(UserOperation, FirstNumber, SecondNumber);
            System.out.println(result);
            scanner.close();
        }
    }
}
