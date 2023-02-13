package Lesson7HomeTask;

public class PetEatAndSleep {
    public static void main(String[] args) {

        Cat catCat= new Cat("Сатаняка");
        catCat.eating(3);
        catCat.sleeping(16);
        System.out.println();

        Wife myWife= new Wife("Жена");
        myWife.eating(3);
        myWife.sleeping(5);
        System.out.println();

        Seal sealDumpling= new Seal("Пельмень");
        sealDumpling.eating(15);
        sealDumpling.sleeping(6);
    }
}
