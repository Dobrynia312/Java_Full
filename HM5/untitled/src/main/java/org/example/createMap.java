package org.example;

import java.util.Random;

public class createMap {
    public static int[][] CreateMap(int x, int y) {
        Random random = new Random();
        int[][] arr = new int[x][y];
        for (int i = 0; i < y; i++) {
            arr[0][i] = -1;
            arr[x - 1][i] = -1;
        }
        for (int i = 0; i < x; i++) {
            arr[i][0] = -1;
            arr[i][y - 1] = -1;
        }
        for (int i = 1; i < x - 2; i++)
            for (int j = 1; j < y - 2; j++) {
                int r;
                r = random.nextInt(0, 2);
                if (r == 0) {
                    arr[i][j] = -1;
                }
                if (arr[i - 1][j - 1] == -1 && arr[i + 1][j - 1] == -1) {
                    arr[i][j] = 0;
                }
                if (arr[i + 1][j + 1] == -1 && arr[i - 1][j + 1] == -1) {
                    arr[i][j] = 0;
                }
                if (arr[i - 1][j] == -1 && arr[i + 1][j] == -1) {
                    arr[i][j] = 0;
                }
                if (arr[i][j - 1] == -1 && arr[i][j + 1] == -1) {
                    arr[i][j] = 0;
                }

            }
        return arr;
    }
}

