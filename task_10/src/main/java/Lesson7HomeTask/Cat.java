package Lesson7HomeTask;

public class Cat {
    String name;
    int eats;
    int sleeps;

    public Cat(String name) {
        this.name = name;
    }
    public void eating(int food){
        eats=0;
        System.out.println(name+" может съесть "+food+" главное больше чем"+eats);
    }
    public void sleeping(int hours){
        sleeps=0;
        System.out.println("Я " +name+ " могу спать сколько угодно часов даже "+hours);

    }
}
