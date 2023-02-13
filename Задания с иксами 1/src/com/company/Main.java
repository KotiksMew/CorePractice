package com.company;

public class Main {

    public static void main(String[] args) {
        int b = 3;                           //Размер массива
        int[][] array = new int[b][b];

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
              if (i==j)  array[i][j]=1;
              if (b-1==i+j) array[i][j]=1;
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