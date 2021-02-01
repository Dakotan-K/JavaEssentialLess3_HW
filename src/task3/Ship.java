package task3;

public class Ship extends Vehicle {
    private int passengerShip;
    private String namePort;

    public Ship(int speed, int price, int year, int passengerShip, String namePort) {
        super(speed, price, year);
        this.passengerShip = passengerShip;
        this.namePort = namePort;
    }

    public int getPassengerShip() {
        return passengerShip;
    }

    public String getNamePort() {
        return namePort;
    }
}
