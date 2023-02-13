package com.company;

public class Main {

    public static void main(String[] args) {
        int b = 7;                           //Размер массива
        int[][] array = new int[b][b];

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
                 array[i][j]=j+1;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();

        }


    }
}