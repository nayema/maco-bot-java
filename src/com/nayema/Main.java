package com.nayema;

public class Main {

    public static void main(String[] args) {
        ADICalculator adiCalculator = new ADICalculator(0, 2.75, 40.0);
        double adi = adiCalculator.calculateADI();

        L4Calculator l4Calculator = new L4Calculator(adi, 450, 125000);

        System.out.println("ADI is: " + adi);
        System.out.println("L4 is: " + l4Calculator.calculateL4());
    }
}
