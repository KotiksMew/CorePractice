package Lesson5HomeTask;

import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int lastValue = 0;
        int secondValue = 1;
        int currentDigit = 0;
        System.out.print("Введите положительное число для расчета : ");
        index = scanner.nextInt();
        while (index < 0) {
            System.out.println("Вы ввели некоректное значение!");
            index = scanner.nextInt();

        }

        for (int i = 1; i <= index; i++) {
            currentDigit = lastValue + secondValue;
            lastValue = secondValue;
            secondValue = currentDigit;
        }
        System.out.println("На " + index + " месте в ряду Фибоначчи ");
        System.out.println("Стоит число " + currentDigit + " !!!");
    }
}
