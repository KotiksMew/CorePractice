package Lesson3HomeTask;

public class ThirdProgram {

    public static void main(String[] args) {
        factorial(5);
    }

    static void factorial(int x) {
        int factorialCalc = 1;
        for (int i = 1; i <= x; i++) {
            factorialCalc = factorialCalc * i;
        }
        System.out.println("факториал числа " + x + "! = " + factorialCalc);
    }
}
