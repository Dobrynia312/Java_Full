package org.example;

public class stringMap {
    static String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int[] ints : map) {
            for (int anInt : ints) {
                sb.append(String.format(" %2d ", anInt));
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
