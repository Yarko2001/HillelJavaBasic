package homework_12;

public class CarSecondTask {
    private int year;
    private String color;

    public CarSecondTask() {
    }

    public CarSecondTask(String color) {
        this.color = color;
    }

    public CarSecondTask(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args) {
        CarSecondTask firstCar = new CarSecondTask();
        CarSecondTask secondCar = new CarSecondTask("white");
        CarSecondTask thirdCar = new CarSecondTask(2015, "black");
    }
}
