package application;

import entities.Students;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Students> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int studentA = sc.nextInt();

        for(int i = 0; i < studentA; i++) {
            int userNumber = sc.nextInt();
            set.add(new Students(userNumber));
        }

        System.out.print("How many students for course B? ");
        int studentB = sc.nextInt();

        for(int i = 0; i < studentB; i++) {
            int userNumber = sc.nextInt();
            set.add(new Students(userNumber));
        }

        System.out.print("How many students for course C? ");
        int studentC = sc.nextInt();

        for(int i = 0; i < studentC; i++) {
            int userNumber = sc.nextInt();
            set.add(new Students(userNumber));
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
