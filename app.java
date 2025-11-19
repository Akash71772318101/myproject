package com.game;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 50) + 1;
        int guess = 0;
        System.out.println("Welcome to guess the number game");
        System.out.println("I have selected a number between 1 and 50.");
        System.out.println("Try to guess it!");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number.");
                sc.next(); 
                continue;
            }
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too High! Try again.");
            } else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Correct! You win!");
            }
        }
        sc.close();
    }
}
