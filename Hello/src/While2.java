import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";

        while (true) {
            System.out.println("Digite um nome: ");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;
        }
    }
}
