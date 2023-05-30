import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(F = C * 1.8 + 32)

        System.out.println("\t\t\tДобро пожаловать в конвертер температуры из цельсия в фаренгейт");
        System.out.println("Введите температуру в градусах цельсия:");
        double tempc = new Scanner(System.in).nextDouble();
        double onecoof = 1.8;
        int twocoof = 32;

        System.out.println("C: " + tempc + " градусов по цельсию\n" + "Это "
                + (tempc * onecoof + twocoof) + " градусов по фаренгейту");
    }
}
