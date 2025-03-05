package com.calculadora;

import com.calculadora.ExecutingOperations.Calculator;
import com.calculadora.IMCServices.IMCOperations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        while (true) {
            Calculator calculator = new Calculator(); // calculator class
            IMCOperations calculateIMC = new IMCOperations(); // IMC calculator class
            Scanner scanner = new Scanner(System.in); // scanner intance

            System.out.println("----/---- UTILITÁRIOS -----/-----");
            System.out.println("Escolha oque você deseja usar hoje:");
            System.out.println("(1) Calculadora IMC");
            System.out.println("(2) Calculadora Comum");
            byte userChoice = scanner.nextByte();
                // IMC
            if (userChoice == 1 ) {
                System.out.println("Vamos precisar do seu peso(EX: 73,0): ");
                String getuserWeight = scanner.nextLine();
                getuserWeight = getuserWeight.replace('.', ',');
                double userWeight = Double.parseDouble(getuserWeight);
                System.out.println("Agora vamos precisar da sua altura(EX: 1,75): ");
                double userHeight = scanner.nextDouble();
                double resultIMC = calculateIMC.calculateIMC(userWeight, userHeight);
                System.out.println("O seu IMC é "+resultIMC);
                continue; // while expression
            }
                // calculator
            if (userChoice == 2) {
                System.out.println("Digite o Primeiro Número:");
                int FirstNumber = scanner.nextInt();
                System.out.println("Digite o Segundo Número:");
                int SecondNumber = scanner.nextInt();
                System.out.println("Digite a Operação que deseja --> + (Soma) - (Subtrair) * (multiplicação) / (divisão)");
                String UserOperation = scanner.next();
                int result = calculator.executeMathOperation(UserOperation, FirstNumber, SecondNumber);
                System.out.println(result);
                continue;
            }
            scanner.close();
        }
    }
}
