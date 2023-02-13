package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double a = -11;                       // ax^2+bx+c=0  формула и переменные a,b,c
        double b = -22;
        double c = 150;
        double d;                             // Дискриминант
        d = b * b - 4 * a * c;                // формула вычисления дискриминанта х,х1,х2 корни уравнения
        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: х1= " + x1 + " x2= " + x2);
        }
        else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
        else{
            System.out.println("Не имеет корней");
        }
    }
}
