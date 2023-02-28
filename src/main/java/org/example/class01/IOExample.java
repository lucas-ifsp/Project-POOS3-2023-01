package org.example.class01;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        final String input = scanner.nextLine();
        System.out.println("Olá " + input);
    }
}
