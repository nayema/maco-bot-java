package com.nayema.calculation;

public class L4Calculator {
    private double adi;
    private double batchSizeOfNextProductInKG;
    private double totalSharedSurfaceArea;
    
    public L4Calculator(double adi, double batchSizeOfNextProductInKG, double totalSharedSurfaceArea) {
        this.adi = adi;
        this.batchSizeOfNextProductInKG = batchSizeOfNextProductInKG;
        this.totalSharedSurfaceArea = totalSharedSurfaceArea;
    }

    public double calculateL4() {
        return calculateL3() * 100;
    }

    public double calculateL3() {
        return calculateL2() / totalSharedSurfaceArea;
    }

    public double calculateL2() {
        double CONVERSION_RATIO_TO_MICROGRAMS = 1000000000.00;
        return calculateL1() * (batchSizeOfNextProductInKG * CONVERSION_RATIO_TO_MICROGRAMS);
    }

    public double calculateL1() {
        double MAX_DOSE_OF_NEXT_PRODUCT = 2000.00;
        return adi / MAX_DOSE_OF_NEXT_PRODUCT;
    }
}
