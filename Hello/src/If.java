import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        var name = scanner.next();
        System.out.println("Informe a idade: ");
        var age = scanner.nextInt();
        System.out.println("É emancipado? (s/n): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s tem %s anos e pode dirigir! \n", name, age);
        } else if(age >= 16 && isEmancipated) {
            System.out.printf("%s tem %s anos, mas pode dirigir! \n", name, age);
        } else {
            System.out.printf("%s tem %s anos e não pode dirigir! \n", name, age);
        }
    }
}
