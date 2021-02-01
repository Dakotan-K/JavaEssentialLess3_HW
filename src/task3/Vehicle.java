package task3;

public class Vehicle {
    private int speed;
    private int price;
    private int year;

    public Vehicle(int speed, int price, int year) {
        this.speed = speed;
        this.price = price;
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
