package homework_12;

public class CarFourthTask {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public CarFourthTask() {
    }

    public CarFourthTask(int year) {
        this.year = year;
    }

    public CarFourthTask(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public CarFourthTask(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public CarFourthTask(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        CarFourthTask firstCar = new CarFourthTask();
        CarFourthTask secondCar = new CarFourthTask(2005);
        CarFourthTask thirdCar = new CarFourthTask(2010, 200);
        CarFourthTask fourthCar = new CarFourthTask(2013, 230, 1500);
        CarFourthTask fifthCar = new CarFourthTask(2019, 300, 1750, "Black");
    }
}
