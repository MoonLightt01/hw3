import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(F = C * 1.8 + 32)

        System.out.println("\t\t\tДобро пожаловать в конвертер температуры из цельсия в фаренгейт");
        System.out.println("Введите температуру в градусах цельсия:");
        double tempC = new Scanner(System.in).nextDouble();
        double oneCoof = 1.8;
        int twoCoof = 32;

        System.out.println("C: " + tempC + " градусов по цельсию\n" + "Это "
                + (tempC * oneCoof + twoCoof) + " градусов по фаренгейту");
    }
}
