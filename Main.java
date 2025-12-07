package algosmoothie;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("             HOMEPAGE");
        System.out.println("---- WELCOME TO ALGOSMOOTHIES ----");
        System.out.println("1. Make Order");
        System.out.println("2. Payment");
        System.out.println("0. Log out");
        System.out.print("Choose with number : ");
        // penggunaan scanner
        int pilihan = scanner.nextInt();
        System.out.println();

        // penggunaan if-else statement
        if (pilihan == 1) {
            menuCust.menufruit();       //pemanggilan fungsi antar class

        } else if (pilihan == 2){
            Payment.payment();
        } else if (pilihan == 0){
            System.out.println("Goodbye!!!");
        }

    }
}
