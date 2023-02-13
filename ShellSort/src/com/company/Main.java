package com.company;

public class Main {

    public static void main(String[] args) {
        int temp;
        int massLen = (int) (Math.random() * 20); //размер массива
        int period = massLen / 3 + 1;
        System.out.println(massLen);
        int[] array;
        array = new int[massLen];
        for (int i = 0; i < array.length; i++) { //заполнение массива
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        for (int h = period; h > 0; h--) { //через какой промежуток сравнивается
            for (int j = 0; j < array.length - h; j = j + h) {
                if ((array[j] > array[j + h]) & (j + h < array.length)) {
                    temp = array[j + h];
                    array[j + h] = array[j];
                    array[j] = temp;
                    j = -h;
                }
            }
        }

        System.out.println();//вывод в консоль отсортированного массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
