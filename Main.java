package algosmoothie;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("             HOMEPAGE");
        System.out.println("---- WELCOME TO ALGOSMOOTHIES ----");
        System.out.println("ROLES ");
        System.out.println("1. OWNER");
        System.out.println("2. CUSTOMER");
        System.out.print("Choose your role : ");
        int role = scanner.nextInt();

        if (role == 1){
            homepageOwner();

        } else if (role == 2){
            homepageCust();

        }
    }
    static void homepageOwner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- WELCOME OWNER ----");
        System.out.println("1. Cek History Pesanan");
        System.out.println("2. Cek Stok bahan");
        System.out.println("0. Log out");
        System.out.print("Choose with number : ");

        int choice = scanner.nextInt();
        System.out.println();
        if(choice == 1){
            Owner.cekHistory();
        } else if (choice == 2){
            Owner.cekStokBahan();
        } else if (choice == 0){
            Main.main(null);
        }
    }
        static void homepageCust(){
            Scanner scanner = new Scanner (System.in);
        System.out.println("---- WELCOME CUSTOMER ----");
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
            Main.main(null);
        }

    }
    
}
