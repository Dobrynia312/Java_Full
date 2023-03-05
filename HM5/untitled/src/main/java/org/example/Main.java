package org.example;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int[][] arr = createMap.CreateMap(x, y);
        int dist = AlgoritmL.pathFinder(arr, 1, 1, 3, 4);
        if (dist == 0) {
            System.out.print("Выход недостежим");
        } else {
            System.out.printf("Самый короткий путь занял %d", dist);
        }
        System.out.println();
        String xx = stringMap.rawData(arr);
        System.out.println(xx);


    }
}