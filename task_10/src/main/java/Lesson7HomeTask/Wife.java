package Lesson7HomeTask;

public class Wife {
    String name;
    int eats;
    int sleeps;

    public Wife(String name){
        this.name=name;
    }

    public void eating(int sugarKg){
        eats=0;
        if(eats<sugarKg){
        System.out.println(name+" ест его в любых количествах и "+sugarKg+" киолограмма не предел");}
        else {
            System.out.println(name+" очень очень грустно");
        }
    }

    public void sleeping(int hours){
        sleeps=10;
        if(0<hours&&hours<sleeps){
            System.out.println(name+" спала всего "+hours+" бегите глупцы!");
        }
        if(0>hours){
            System.out.println("Всем пипец "+name+" не спала");}
        if(sleeps<hours){
            System.out.println("Счастье в доме "+name+" выспалась проспав "+hours+" часов");
        }
    }
}
