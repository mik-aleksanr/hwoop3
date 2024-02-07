package clinic.drugstore;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public abstract class Components implements Comparable<Components> {
    private String title;
    private Double weight;
    private int power;

    public Components(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public Double getW() {
        return weight;
    }

    public int getP() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", title, weight, power);
    }

    //метод Comparable
    @Override
    public int compareTo(Components o) {
        return Integer.compare(this.power, o.power); //это выражение вернет ту же логику
        // что закоментированное ниже, если в этом выражении аргументы поменять местами
        //то сортировка будет убывающей
//        if (this.power < o.power) return -1;
//        else if (this.power > o.power) return 1;
//        else return 0;
    }
}
