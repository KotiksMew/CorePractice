package Lesson4HomeTask;

public class FourthProgram {
    public static void main(String[] args) {
        int n = 3;
        if(sqrt(n)==-1){
            System.out.println("Попытка найти корень числа меньше 1");
        }
        else System.out.println("целый корень "+sqrt(n));
    }

    public static int sqrt(int n) {
        if(n<1) return -1;
            int i = 1;
            while (i * i <= n) {
                i++;
            }
            return --i;

    }
}