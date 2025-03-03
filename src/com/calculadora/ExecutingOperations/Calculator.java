package com.calculadora.ExecutingOperations;

public class Calculator {
    public int executeMathOperation(String userOperation, int firstNumber, int secondNumber) {
        switch (userOperation) {
            case "+":
               return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Operação Inválida: " + userOperation);
        }
    }
}
