package org.example;

import java.util.LinkedList;
import java.util.Queue;

class AlgoritmL {
    static boolean Accessability(int[][] matrix, boolean[][] visited, int row, int col) {
        return ((row < matrix.length-1) &&
                (col < matrix[0].length-1) &&
                (matrix[row][col] == 0) &&
                (!visited[row][col]));
    }

    public static int pathFinder(int[][] matrix, int i, int j, int x, int y) {
        int[] gorMove = {0, 1, 0, -1};
        int[] vertMove = {1, 0, -1, 0};

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        Queue<Point> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new Point(i, j, 0));
        int minimum_distance = 0;

        while (!q.isEmpty()) {
            Point point = q.poll();
            i = point.x;
            j = point.y;
            int dist = point.distance;
            if (i == x && j == y) {
                minimum_distance = dist;
                matrix[i][j] = dist;
                break;
            }

            for (int k = 0; k < 4; k++) {
                if (Accessability(matrix, visited, i + vertMove[k], j + gorMove[k])) {
                    visited[i + vertMove[k]][j + gorMove[k]] = true;
                    Point n = new Point(i + vertMove[k], j + gorMove[k], dist + 1);
                    matrix[i][j] = dist;
                    q.add(n);
                }
            }
        }
        return minimum_distance;
    }
}
