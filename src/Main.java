import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter celsius" + " °C");
        Scanner celsius = new Scanner(System.in);
        double fahrenheit = (celsius.nextDouble()) * 1.8 + 32;
        System.out.println("this is " + fahrenheit + " °F");
    }
}