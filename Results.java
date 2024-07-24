package Ademo;

import java.util.ArrayList;
import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Enter student grades. Type 'done' to finish:");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                double grade = Double.parseDouble(input);
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade);
                } else {
                    System.out.println("Please enter a valid grade between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();
            System.out.println("The average grade is: " + average);
        }
        	scanner.close();
    }
}