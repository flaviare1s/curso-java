import java.util.Scanner;

public class ElvisOperator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        var name = scanner.next();
        System.out.println("Informe a idade: ");
        var age = scanner.nextInt();
        System.out.println("É emancipado? (s/n): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

        var message = canDrive ? name + " você pode dirigir!" : name + " você não pode dirigir!";

        System.out.println((message));
    }
}
