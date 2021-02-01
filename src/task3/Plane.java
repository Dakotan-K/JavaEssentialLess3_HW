package task3;

public class Plane extends Vehicle {
    private int wight;
    private int passengerPlane;

    public Plane(int speed, int price, int year, int wight, int passengerPlane) {
        super(speed, price, year);
        this.wight = wight;
        this.passengerPlane = passengerPlane;
    }

    public int getWight() {
        return wight;
    }

    public int getPassengerPlane() {
        return passengerPlane;
    }
}
