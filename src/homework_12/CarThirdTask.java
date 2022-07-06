package homework_12;

public class CarThirdTask {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public CarThirdTask() {
    }

    public CarThirdTask(int year) {
        this.year = year;
    }

    public CarThirdTask(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public CarThirdTask(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public CarThirdTask(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        CarThirdTask car = new CarThirdTask();
        CarThirdTask firstCar = new CarThirdTask(2010);
        CarThirdTask secondCar = new CarThirdTask(2011, 120);
        CarThirdTask thirdCar = new CarThirdTask(2015, 150, 2100);
        CarThirdTask fourthCar = new CarThirdTask(2022, 220, 1900, "White");

    }
}
