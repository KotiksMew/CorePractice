package Lesson8HomeTask;

public class PetsVoicer {
    public static void main(String[] args) {
        Pet[] pet =new Pet[4];
        pet[0]= new Dog("Nightmare");
        pet[1]=new Tiger("Electra","Я не умею мяу мяу могу только мурмур");
        pet[2]=new Wife("myWife");
        pet[3]= new Cat("Satanyaka");

        for (int i = 0; i < pet.length; i++) {
pet[i].voice();
        }
    }
}
