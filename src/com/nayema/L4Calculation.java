package com.nayema;

public class L4Calculation {
    public double l1;
    public double l2;
    public double l3;
    public double l4;
    private double totalSharedSurfaceArea;
    private ADICalculation adiValue;

    public L4Calculation(ADICalculation adi) {
        this.adiValue = adi;
    }

    public void setTotalSharedSurfaceArea(double totalSharedSurfaceArea) {
        this.totalSharedSurfaceArea = totalSharedSurfaceArea;
    }

    public void calculateL1() {
        double MAX_DOSE_OF_NEXT_PRODUCT = 2000.00;

        l1 = adiValue.adi / MAX_DOSE_OF_NEXT_PRODUCT;
    }

    public void calculateL2() {
        calculateL1();
        l2 = l1 * 1000000000 / 1;
    }

    public void calculateL3() {
        calculateL2();
        l3 = l2 / totalSharedSurfaceArea;
    }

    public void calculateL4() {
        calculateL3();
        l4 = l3 * 100;
    }
}
