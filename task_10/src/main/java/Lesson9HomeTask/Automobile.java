package Lesson9HomeTask;

public abstract class Automobile {
    protected String model;
    protected Double distance;


    public Automobile(String model, Double distance) {
        this.distance = distance;
        this.model = model;
    }

    public abstract void move(String model, Double distance);
}