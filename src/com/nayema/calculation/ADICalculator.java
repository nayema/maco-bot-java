package com.nayema.calculation;

public class ADICalculator {
    private double minOfADEOrPDE;
    private double ttc;
    private double mdd;

    public ADICalculator(double minOfADEOrPDE, double ttc, double mdd) {
        this.minOfADEOrPDE = minOfADEOrPDE;
        this.ttc = ttc;
        this.mdd = mdd;
    }

    public double calculateADI() {
        if (minOfADEOrPDE == 0) {
            return Math.min(ttc, mdd);
        }
        return minOfADEOrPDE;
    }
}