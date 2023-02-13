package Lesson6HomeTask;

//Вычисление max,min,avg в массивах:
//Условие:Заполните массив(длина запрашивается у пользователя через консоль)случайным числами,используя метод Math.random(),
// который возвращает значение в промежутке[0,1].Реализуйте 3метода,рассчитывающих минимальное,максимальное и
//среднее значения среди заполненных значений массива.

import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Введите размер массива: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некоректное значение, попробуйите снова");
                scanner.next();
            }
            a = scanner.nextInt();
        }
        while (a < 0);
        double[] array = new double[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
        }
        double min = array[0];
        double average = 0;
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            average = average + (array[i]/array.length);
        }

        System.out.println("Минимальное число массива = " + min);
        System.out.println("Среднее число массива = " + average);
        System.out.println("Максимальное число массива = " + max);
    }
}

