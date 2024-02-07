package clinic.drugstore;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Pharmacy implements Comparable<Pharmacy>, Iterable<Components> {

    private String titleP;

    private List<Components> components = new ArrayList<>();
    private int index;
    Double w = 0.0;
    int p = 0;

    public Pharmacy(String titleP) {
        this.titleP = titleP;
    }

    public Double getWeight() {
        for (Components i : components) {
            w = w + i.getW();
        }
        return w;
    }

    public int getPower() {
        for (Components i : components) {
            p = p + i.getP();
        }
        return p;
    }

    public void addComponents(Components... components) {
        for (Components c : components) {
            this.components.add(c);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s", titleP, components);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return 0;
    }

    @Override
    public Iterator<Components> iterator() {
        return new Iterator<Components>() {// воспользуемся анонимным классом
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Components next() {
                return components.get(index++);
            }
        };
    }
}