package com.calculadora.IMCServices;

public class IMCOperations {
    public double calculateIMC(double userWeight, double userHeight) {
        return userWeight / (userHeight * userHeight);
    }
}
