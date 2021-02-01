package task3;

public class Main {
    public static void main(String[] args) {

        Car kia = new Car(170, 900000, 2018);
        System.out.println("KIA: " + "Скорость: " + kia.getSpeed() + " Цена: " + kia.getPrice() + " Год: " + kia.getYear());

        Plane boing = new Plane(1700, 10000000, 2010, 20000, 200);
        System.out.println("BOING: " + " Скорость: " + boing.getSpeed() + " Цена: " + boing.getPrice() + " Год: " + boing.getYear()
         + " Вес: " + boing.getWight() + " Кол-во пассажиров: " + boing.getPassengerPlane());

        Ship titan = new Ship(100, 1000000, 2016, 30, "Находка");
        System.out.println("TITAN: " + " Скорость: " + titan.getSpeed() + " Цена: " + titan.getPrice() + " Год: " + titan.getYear()
                + " Кол-во пассажиров: " + titan.getPassengerShip() + " Порт: " + titan.getNamePort());

    }
}
