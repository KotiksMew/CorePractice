package Lesson9HomeTask;

public class AutomobileRunner {
    public static void main(String[] args) {
        Double distance = 0.0;

        Automobile[] automobile = new Automobile[9];
        automobile[0] = new Car("Бэтмобиль", Math.random() * 1000);
        automobile[1] = new Car("КоробокНаКолесах", Math.random() * 1000);
        automobile[2] = new Car("Ягуар", Math.random() * 1000);
        automobile[3] = new Car("Кестрель", Math.random() * 1000);
        automobile[4] = new Car("Вольф", Math.random() * 1000);
        automobile[5] = new Car("Шоха", Math.random() * 1000);
        automobile[6] = new Truck("Камаз", Math.random() * 1000);
        automobile[7] = new Truck("ФураЯндексДоставкиВезущаяНамСтиралку", Math.random() * 1000);
        automobile[8] = new Truck("MonsterTruck", Math.random() * 1000);

        for (int i = 0; i < automobile.length; ++i) {
            String model = null;
            automobile[i].move(model, distance);
        }

    }


}