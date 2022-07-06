package homework_12;

public class CarFirstTask {
    private String maker;
    private String color;
    private String bodyType;

    public CarFirstTask() {
        maker = "Porsche";
        color = "Серебристый";
        bodyType = "Купе";
    }

    private String accelerate() {
        String motion = "Ускоряется...";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " цвет " + color);
        System.out.println(maker + " тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }

    public static void main(String[] args) {
        CarFirstTask Porsche = new CarFirstTask();
        Porsche.getCar();
        CarFirstTask Ferrari = new CarFirstTask();
        Ferrari.setCar("Ferrari", "Красный", "Спортивный");
        Ferrari.getCar();
    }
}
