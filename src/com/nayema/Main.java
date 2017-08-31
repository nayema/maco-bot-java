package com.nayema;

public class Main {

    public static void main(String[] args) {
        ADICalculation adiValue = new ADICalculation("", "2.75", "40.0");
        L4Calculation l4Calculator = new L4Calculation(adiValue);

        l4Calculator.setTotalSharedSurfaceArea(1002.5);

        System.out.println("ADI is: " + adiValue.adi);
        l4Calculator.calculateL4();
        System.out.println("L4 is: " + l4Calculator.l4);
    }
}
