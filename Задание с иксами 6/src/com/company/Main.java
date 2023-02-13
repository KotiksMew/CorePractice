package com.company;

public class Main {

    public static void main(String[] args) {
        int b = 9;                           //Размер массива
        int[][] array = new int[b][];
        for (int i = 0; i< array.length;i++){
            array[i]= new int [i];
            }

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
                if(i>=j) array[i][j]=1;

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