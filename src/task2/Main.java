package task2;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(2012, "Black");
        int yearMyCar = myCar.getYear();
        String myCarColor = myCar.getColor();

        Car car2 = new Car(2002);
        int yearCar2 = car2.getYear();

        Car car3 = new Car();
        car3.setYear(2019);
        car3.setColor("Pink");
        int yearCar3 = car3.getYear();
        String colorCar3 = car3.getColor();

        System.out.println("The date of manufacture of my car - " + yearMyCar + "\n" +
                "And color - " + myCarColor);
        System.out.println();
        System.out.println("The date of manufacture of car2 - " + yearCar2);
        System.out.println();
        System.out.println("The date of manufacture of car3 - " + yearCar3 + "\n" +
                "And color - " + colorCar3);
    }
}
