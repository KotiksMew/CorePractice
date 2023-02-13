package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int sicret;
        int currentNumber = -1;
        int minNum = 0;
        int maxNum = 100;
        Scanner scanner = new Scanner(System.in);
        sicret = (int) (Math.random() * 100);

        System.out.println("Сколько котиков попало в шаурму?");
        System.out.println("Угадай число  котиков от 0 до 100");
        System.out.println("Сколько котиков? ");

        for (; currentNumber != sicret; ) {
            currentNumber = scanner.nextInt();
if (currentNumber<0){
    System.out.println("ОТРИЦАТЕЛЬНЫХ КОТИКОВ НЕТ");
}
            if (currentNumber < minNum) {
                System.out.println("Объеба, котиков БОЛЬШЕ, чем " + minNum);
            }

            if (currentNumber > maxNum) {
                System.out.println("Объеба, котиков МЕНЬШЕ, чем " + maxNum);
            }
            if (currentNumber == sicret) {
                System.out.println("Да, это грустно, но котиков в шаурме сгинуло " + sicret);
                System.out.println("Шутка, ни один котик не пострадал");
            }
            if ((currentNumber > sicret) & (currentNumber < maxNum)) {
                System.out.println("Кошь мазила, котиков МЕНЬШЕ ");
                maxNum = currentNumber;
            }
            if ((currentNumber < sicret) & (currentNumber > minNum)) {
                System.out.println("Кошь мазила, котиков БОЛЬШЕ");
                minNum = currentNumber;
            }
        }
    }
}
