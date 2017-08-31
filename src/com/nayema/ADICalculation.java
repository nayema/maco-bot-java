package com.nayema;

public class ADICalculation {
    public double adi;

    public ADICalculation(String enterMinOfADEOrPDE, String enterTTC, String enterMDD) {

        if (enterMinOfADEOrPDE.equals("")) {
            System.out.println("No ADE and/or PDE provided from client");
            double ttc = Double.parseDouble(enterTTC);
            double mdd = Double.parseDouble(enterMDD);
            adi = Math.min(ttc, mdd);
        } else {
            adi = Double.parseDouble(enterMinOfADEOrPDE);
        }
    }
}
