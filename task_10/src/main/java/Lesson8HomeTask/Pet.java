package Lesson8HomeTask;

public class Pet {
    private String name;
    private String voice;

    public Pet(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public Pet(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println(this.name+" Говорит - "+voice);
    }
}
