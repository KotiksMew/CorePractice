package Lesson2HomeTask;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("add= "+add(3,5));

        System.out.println("subt= "+subtract(16,8));

        System.out.println("mult= "+multiply(2,4));

        System.out.println("div= "+div(17,2));
        System.out.println();               // Для пустой строки
        printQuad();
    }

    public static double add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int subtract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static double multiply(int arg1, int arg2) {
        return  arg1 * arg2;
    }

    public static double div (double arg1, double arg2) {
        return (arg1/arg2);
    }

    public static void printQuad() {
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
