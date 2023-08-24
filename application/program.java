package application;

import java.util.Locale;
import java.util.Scanner;


import entities.circle;
import entities.square;

public class program {
 
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("The object is a circle or a square? ");
        String name = sc.nextLine();

   
        if(name.equals("circle")){
            System.out.print("What is the value of the radius of the circle?");
            Double radius = sc.nextDouble();

            circle circle = new circle(radius);

            System.out.println("The name of the object is " + circle.getName() + String.format("\nThe area is %.2f", circle.getArea()) + String.format("\nThe perimeter is %.2f", circle.getPerimeter()));

        }
        else if(name.equals("square")){ 
            System.out.print("What is the value of the side of the square?");
            Double side = sc.nextDouble();

            square square = new square (side);

            System.out.println("The name of the object is " + square.getName() + String.format("\nThe area is %.2f", square.getArea()) + String.format("\nThe perimeter is %.2f", square.getPerimeter()));

        } else {
            System.out.println("Invalid name");
        }
    } 

}


    

