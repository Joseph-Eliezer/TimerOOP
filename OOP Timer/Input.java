import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public double getHours() {
        System.out.print("Enter hours: ");
        return scanner.nextDouble();
    }

    public double getMinutes() {
        System.out.print("Enter Minutes: ");
        return scanner.nextDouble();
    }

    public double getSeconds() {
        System.out.print("Enter seconds: ");
        return scanner.nextDouble();
    }
}
