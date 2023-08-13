package Tasl2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите свой год рождение ");
        int a = scanner.nextInt();
        Period.dateOfBirth(a);


    }
}
