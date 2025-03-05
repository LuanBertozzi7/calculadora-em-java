package com.calculadora.IMCServices;

import java.text.DecimalFormat;

public class IMCOperations {
    public double calculateIMC(double userWeight, double userHeight) {

        DecimalFormat ImcFormat = new DecimalFormat("#,##");
        ImcFormat.setMaximumFractionDigits(1);
        double userWeightImc = Double.parseDouble(ImcFormat.format(userWeight));
        double userHeightImc = Double.parseDouble(ImcFormat.format(userHeight));
        double imcOperation = userWeightImc / (userHeightImc * userHeightImc);
        return imcOperation;
    }
}
