package printer;

public class ColorPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[34m" + value + (char) 27 + "[39m");
    }
}
