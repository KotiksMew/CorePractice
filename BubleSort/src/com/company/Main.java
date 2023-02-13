package com.company;

public class Main {

    public static void main(String[] args) {
        int temp;
        int massLen = (int) (Math.random() * 20);
        System.out.println(massLen);
        int[] array;
        array = new int[massLen];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                i = -1;

            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}