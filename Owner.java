package algosmoothie;

import java.util.Scanner;

public class Owner {
   static void cekHistory(){
    Scanner sc = new Scanner(System.in);
    System.out.println("--- HISTORY PESANAN (" + menuCust.orderHistory.size() + " total) ---");
    
    if (menuCust.orderHistory.isEmpty()) {
        System.out.println("Belum ada pesanan.");
        System.out.println("Returning to homepage...");
        Main.homepageOwner();
    } else {
        System.out.println("\nSemua pesanan :");
        int index = 1;
        // Tampilkan TERBARU dulu dari history permanen
        for (int i = menuCust.orderHistory.size() - 1; i >= 0; i--) {
            System.out.println(index++ + ". " + menuCust.orderHistory.get(i));
            System.out.println();

            System.out.println();
            System.out.println("Press Enter to go back to homepage");
            String enter = sc.nextLine();
            Main.homepageOwner();

        }

    }
}
    
    static void cekStokBahan() { 
        Scanner sc =  new Scanner(System.in);
    System.out.println("--- STOK BAHAN (Real-time) ---");
    System.out.printf("%-15s %10s\n", "Bahan", "Stok");
    System.out.println("--------------------------------");
    for (menuCust.Inventory inv : menuCust.inventory) {
        System.out.printf("%-15s %8d\n", inv.name, inv.stock);
    }
    System.out.println("--------------------------------");
    System.out.println("Press Enter to go back to homepage...");
    String enter = sc.nextLine();
    Main.homepageOwner();
}
}

