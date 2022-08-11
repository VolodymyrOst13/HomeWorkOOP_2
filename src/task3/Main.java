package task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2012);
        Car car3 = new Car(2019,160);
        Car car4 = new Car(2022, 280, 2800);
        Car car5 = new Car(2021, 360, 1200, "Midnight");

        car1.setYear(2002);
        car1.setSpeed(180);
        car1.setWeight(1500);
        car1.setColor("Grey");

        int yearCar1 = car1.getYear();
        double speedCar1 = car1.getSpeed();
        int weightCar1 = car1.getWeight();
        String colorCar1 = car1.getColor();

        int yearCar2 = car2.getYear();

        int yearCar3 = car3.getYear();
        double speedCar3 = car3.getSpeed();

        int yearCar4 = car4.getYear();
        double speedCar4 = car4.getSpeed();
        int weightCar4 = car4.getWeight();

        int yearCar5 = car5.getYear();
        double speedCar5 = car5.getSpeed();
        int weightCar5 = car5.getWeight();
        String colorCar5 = car5.getColor();

        System.out.println("Car1:\n" + "Year - " + yearCar1 + "\n" + "Speed - " + speedCar1 + "\n" + "Weight - "
                + weightCar1 + "\n" + "Color - " + colorCar1 + "\n");

        System.out.println("Car2:\n" + "Year - " + yearCar2 + "\n");

        System.out.println("Car3:\n" + "Year - " + yearCar3 + "\n" + "Speed - " + speedCar3 + "\n");

        System.out.println("Car4:\n" + "Year - " + yearCar4 + "\n" + "Speed - " + speedCar4 + "\n" + "Weight - "
                + weightCar4 + "\n");

        System.out.println("Car5:\n" + "Year - " + yearCar5 + "\n" + "Speed - " + speedCar5 + "\n" + "Weight - "
                + weightCar5 + "\n" + "Color - " + colorCar5 + "\n");
    }
}
