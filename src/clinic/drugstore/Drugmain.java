package clinic.drugstore;

import clinic.drugstore.component.Azitronite;
import clinic.drugstore.component.Penicillin;
import clinic.drugstore.component.Preparat;
import clinic.drugstore.component.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {

        Components water = new Water("Water", 10D, 1);
        Components azitronite = new Azitronite("Azitronite", 2D, 14);
        Components penicillin = new Penicillin("Penicillin", 1.6D, 6);
        //Создаем композицию лекарств
        Pharmacy p1 = new Pharmacy("p1");
        Pharmacy p2 = new Pharmacy("p2");
        Pharmacy p3 = new Pharmacy("p3");
        //добавляем сотавляющие
        p1.addComponents(water, azitronite);
        p2.addComponents(water, penicillin);
        p3.addComponents(azitronite, penicillin);
        //Создаем и наполняем список
        List<Pharmacy> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        System.out.println(p);
        //для получения получившегося препарата создаем класс Preparat и при помощи
        //функций get, класса Pharmacy передаем в его поля информацию о его свойствах
        Double w1 = p1.getWeight();
        int pp1 = p1.getPower();
        Preparat preparat1 = new Preparat("p1", w1, pp1);
        Double w2 = p2.getWeight();
        int pp2 = p2.getPower();
        Preparat preparat2 = new Preparat("p2", w2, pp2);
        Double w3 = p3.getWeight();
        int pp3 = p3.getPower();
        Preparat preparat3 = new Preparat("p3", w3, pp3);
        //Создаем и наполняем список препаратов с конечными свойствами
        List<Preparat> preparats = new ArrayList<>();
        preparats.add(preparat1);
        preparats.add(preparat2);
        preparats.add(preparat3);
        //сортируем и выводим результат, сортировка сделана по весу, можно сортировать
        // и по силе если поменять на закоментированный метод в классе Preparat.
        // Как сделать сразу два не додумался
        Collections.sort(preparats);
        System.out.println(preparats);


    }
}
