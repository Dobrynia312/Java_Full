package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenerateMap arr = new GenerateMap(5,5);
        arr.fillArray();
        for (int[] ints : arr.arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}