import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";

        while(!name.equalsIgnoreCase("exit")) {
            System.out.println("Digite um nome: ");
            name = scanner.next();
            System.out.println(name);
        }
    }
}
