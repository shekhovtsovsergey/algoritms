package org.example;

import org.example.Lesson2.Notebook;
import org.example.Lesson2.SortServiceImpl;

public class Main {

    public static void main(String[] args) {

        SortServiceImpl sortService = new SortServiceImpl();
        Notebook[] notebooks = new Notebook[10];

        for (int i = 0; i < 10; i++) {
            int price = (int) (Math.random() * 1000);
            int ram = (int) (Math.random() * 16) + 1;

            String[] brands = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
            int brandIndex = (int) (Math.random() * brands.length);
            String manufacturer = brands[brandIndex];

            notebooks[i] = new Notebook(price, ram, manufacturer);
        }
        sortService.sort(notebooks);

    }
}