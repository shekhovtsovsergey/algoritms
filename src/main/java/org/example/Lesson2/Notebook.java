package org.example.Lesson2;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Notebook implements Comparable<Notebook>{

    private final int price;
    private final int ram;
    private final String manufacturer;

    @Override
    public int compareTo(Notebook other) {
        if (this.price != other.price) {
            return Double.compare(this.price, other.price);
        } else if (this.ram != other.ram) {
            return Integer.compare(this.ram, other.ram);
        } else {
            return compareBrand(this.manufacturer, other.manufacturer);
        }
    }

    private int compareBrand(String brand1, String brand2) {
        String[] brands = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
        int index1 = Arrays.asList(brands).indexOf(brand1);
        int index2 = Arrays.asList(brands).indexOf(brand2);
        return Integer.compare(index1, index2);
    }
}
