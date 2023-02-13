package Lesson6HomeTask;

import java.util.Scanner;

public class FiboAndKesh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int lastValue = 0;
        int secondValue = 1;
        int currentDigit ;
        int temp;
        System.out.println("Введите начальный размер массива");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели некоректное значение, попробуйите снова");
            scanner.next();
        }
// заполняем стартовый  * Числа Фибоначчи - 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597...
        index = scanner.nextInt();
        double[] array = new double[index];
        for (int i = 0; i < array.length; i++) {
            array[i] = lastValue;
            currentDigit = lastValue + secondValue;
            lastValue = secondValue;
            secondValue = currentDigit;
        }
        // цикл на 10 запросов
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите индекс ячейки без фанатизма(0<;<30)");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некоректное значение, попробуйите снова");
                scanner.next();
            }
            temp = scanner.nextInt();
            if (temp < index) {
                System.out.println(array[temp]);
            } else {
                 lastValue = 0;
                 secondValue = 1;
                array = new double[temp+1];
                for (i = 0; i < array.length; i++) {
                    array[i] = lastValue;
                    currentDigit = lastValue + secondValue;
                    lastValue = secondValue;
                    secondValue = currentDigit;
                }
                System.out.println(array[temp]);
            }
        }
    }
}