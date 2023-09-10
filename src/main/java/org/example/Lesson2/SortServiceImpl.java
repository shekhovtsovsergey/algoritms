package org.example.Lesson2;

import java.util.Arrays;

public class SortServiceImpl {

    public void sort(Notebook[] notebooks){

        boolean isChange = false;
        int limit = notebooks.length;

        while (isChange){
            limit--;
            isChange = false;
            for (int i = 0; i < notebooks.length; i++) {
                if (notebooks[i].getPrice() > notebooks[i+1].getPrice()){
                    swap(notebooks,i);
                    isChange = true;
                } else if (notebooks[i].getRam() > notebooks[i+1].getRam()) {
                    swap(notebooks,i);
                    isChange = true;
                } else if (notebooks[i].getManufacturer().compareTo(notebooks[i+1].getManufacturer()) > 0){
                    swap(notebooks,i);
                    isChange = true;
                }
            }
        }
            System.out.println(limit + " " + Arrays.toString(notebooks));
    }


    public void  swap(Notebook[] notebooks, int i){
        Notebook temp = notebooks[i];
        notebooks[i] = notebooks[i + 1];
        notebooks[i + 1] = temp;
    }

}
