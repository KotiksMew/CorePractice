package Lesson7HomeTask;

public class Seal {
    String name;
    int eats;
    int sleeps;

    public Seal(String name) {
        this.name = name;

    }

    public void eating(int food) {
        eats = 10;
        if (0 < food && food <= eats) {
            System.out.println("Тюлешек "+name+" съел " + food + " килограмм рыбы и рад");
        }
        if (food > eats) {
            System.out.println("Тюлешек "+name+" съел " + food + " килограмм рыбы и лопнул");
        }
        if (eats<0) {
            System.out.println("У тюлешка "+name+" на балансе " + food + " килограмм рыбы и это гурстно");
        }
    }

    public void sleeping(int hours){
        System.out.println( name+ " проспал "+ hours +" часов");
    }
}