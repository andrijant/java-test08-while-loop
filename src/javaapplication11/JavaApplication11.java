package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int choice = -1;
        
        while ( choice !=0 ){
            System.out.println("Enter 0 to end program");
            choice = s.nextInt();
            s.nextLine();
        }
        System.out.println("End of program! Tahnk you!");
    }
}
