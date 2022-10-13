package javaapplication11;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("Enter 0 to end program.");
            choice = s.nextInt();
            s.nextLine();
            
        } while ( choice !=0 );
                
        System.out.println("End of program! Tahnk you!");
    }
}
