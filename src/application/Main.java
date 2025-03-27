package application;


import entitis.Circle;
import entitis.Rectangle;
import entitis.Shape;
import entitis.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int numOfShape = sc.nextInt();
        
        for (int i = 1; i<=numOfShape; i++){
            System.out.println("Shape # " + i + " Data: " );
            System.out.print("Rectangle or circle: ");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if  (shape == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }else{
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            }



        }
        sc.close();
        System.out.println();
        System.out.println("SHAPE AREA");
        for (Shape shape : list){
            System.out.println(shape.area());
        }
    }
}