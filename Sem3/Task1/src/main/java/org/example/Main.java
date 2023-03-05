package org.example;
// naiti kolichestvo marshrutov prevrashenia a v b ispolzuia plus c ili umnojenie na v

import java.util.Scanner;

public class Main {
    public static int getChislo(Scanner iScanner) {

        System.out.print("Введите число: ");

        return Integer.parseInt((iScanner.nextLine()));
    }

    public static int getResultRecurs(int a, int b, int c, int v) {
        if (a == b) {
            return 1;
        } else if (a > b) {
            return 0;
        } else {
            return getResultRecurs(a + c, b, c, v) + getResultRecurs(a * v, b, c, v);
        }
    }

    public static int getResultMass(int a, int b, int c, int v) {
        int[] arr = new int[b];
        arr[0] = 1;
        int[] steps = new int [b];
        steps[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if (arr[i]==arr[j]+c){
                    steps[i]+=steps[j];
                }
                if (arr[i] == (arr[j] * v)) {
                    steps[i]+=steps[j];
                }
            }
        }
        /*for (int x : arr
        ) {
            System.out.print(x + " ");

        }
        for (int x : steps
             ) {
            System.out.print(x + " ");

        }*/
        return steps[steps.length-1];
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int a = getChislo(iScanner);
        System.out.println();
        int b = getChislo(iScanner);
        System.out.println();
        int c = getChislo(iScanner);
        System.out.println();
        int v = getChislo(iScanner);
        System.out.println();

        int res = getResultMass(a, b, c, v);
       int res2 = getResultRecurs(a, b, c, v);
        System.out.println("Количество маршрутов " + res);
       System.out.println("Количество маршрутов " + res2);
        iScanner.close();
    }
}