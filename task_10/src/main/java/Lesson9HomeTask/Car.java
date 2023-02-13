package Lesson9HomeTask;

public class Car extends Automobile {
    private int maxDistance;

    public Car(String model, Double distance) {
        super(model, distance);
    }

    public void move(String model, Double distance) {
        this.maxDistance = 500;
        if (this.maxDistance >= this.distance) {
            System.out.println(this.model + " проедет " + this.distance);
        } else {
            System.out.println(this.model + " На одном баке может проехать, только = " + this.maxDistance);
        }
    }
}