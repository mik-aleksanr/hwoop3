package clinic.drugstore.component;

import clinic.drugstore.Components;
import clinic.drugstore.Pharmacy;

public class Preparat implements Comparable<Preparat> {
    private String titleP;
    private Double weightP;
    private int powerP;

    public Preparat(String titleP, Double weightP, int powerP) {
        this.titleP = titleP;
        this.weightP = weightP;
        this.powerP = powerP;
    }

    @Override
    public String toString() {
        return String.format("%s, weight: %s, power: %s", titleP, weightP, powerP);
    }

//    @Override
//    public int compareTo(Preparat o) {
//        return Integer.compare(this.powerP, o.powerP);
//    }

    @Override
    public int compareTo(Preparat o) {
        return Double.compare(this.weightP, o.weightP);
    }
}

