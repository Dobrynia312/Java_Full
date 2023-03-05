package org.example;

public class GenerateMap {
    int rows;
    int columns;
    public GenerateMap(int x, int y){
        this.rows=x;
        this.columns=y;
    }
    public int[][] arr = new int [rows][columns];
    public void fillArray(){
        for (int i = 0; i <= columns-1; i++) {
            arr[0][i] = -1;
        }
    }
}
