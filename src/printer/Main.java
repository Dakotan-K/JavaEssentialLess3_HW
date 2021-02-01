package printer;

public class Main {
    public static void main(String[] args) {
        Printer one = new Printer();
        ColorPrinter two = new ColorPrinter();

        one.print("Hello World!");
        two.print("Hello World!");
    }
}
