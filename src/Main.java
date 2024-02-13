import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");

        String username = scan.nextLine();
        System.out.println("Привет, " + username);

        System.out.print("Введите любое число номер 1: ");
        float nom1 = scan.nextFloat();

        System.out.print("Введите любое число номер 2: ");
        float nom2 = scan.nextFloat();
        float res1 = nom1 + nom2;
        float res2 = nom1 * nom2;
        if (res1 >=100){
            System.out.println("Сумма обоих чисел больше ста и это уже сложная задача!");
        }

        System.out.println("Вот ваш результат сложения: " + "\n" + res1);
        System.out.println("Вот ваш результат умножения: " + "\t" + res2);


    }
}