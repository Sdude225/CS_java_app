package com.appjava;

import java.util.Scanner;

public class App {
    public static String originalPassword = "1000:7d7d70d5d7253793f24e96ef2bf98415:44bdd9bde103a121406683423aa177f42b865b485256cc782986f3b62a5a9834c697d7cf3ed3b7e3e88f511a35fe212ad3677108df231c82386c2150eb7aa576";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String password = scanner.nextLine();
            if (Hash.validatePassword(password, originalPassword)) {
                System.out.println("Welcome");
                break;
            } else {
                System.out.println("Error, try again");
            }
        }
    }

}
