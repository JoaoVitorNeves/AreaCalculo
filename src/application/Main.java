package application;

import entitis.enums.Color;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of shapes: ");
        int numOfShape = sc.nextInt();
        
        for (int i = 1; i<=numOfShape; i++){
            System.out.println("Shape #" + i + "data: " );
            System.out.print("Rectangle or circle: ");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());



        }

    }
}