import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("1- Fahrenheit -> Celsius \n 2- Celsius -> Fahrenheit");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a temperatura: ");
            double Fahrenheit = scanner.nextDouble();
            double Celsius = (Fahrenheit - 32) * 5 / 9;
            System.out.printf("Temperatura: %.2f°C", Celsius);
        } else if (opcao == 2) {
            System.out.println("Digite a temperatura: ");
            double Celsius = scanner.nextDouble();
            double Fahrenheit = (Celsius * 9 / 5) + 32;
            System.out.printf("Temperatura: %.2f°F", Fahrenheit);
        }
        scanner.close();
    }
}
