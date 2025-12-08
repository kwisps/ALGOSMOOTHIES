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
        
        for (int i = menuCust.orderHistory.size() - 1; i >= 0; i--) {
                System.out.println(index++ + ". " + menuCust.orderHistory.get(i));
                System.out.println();  // Spasi
            }
        }
        
        System.out.println("Press Enter to go back to homepage...");
        sc.nextLine();
        Main.homepageOwner();
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

    static void searchFruitSimple() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cari fruit: ");
    String target = sc.nextLine().toLowerCase();
    
    // SEQUENTIAL SEARCH 
    for (int i = 0; i < menuCust.inventory.length; i++) {
        if (menuCust.inventory[i].name.equalsIgnoreCase(target)) { 
            System.out.printf(" %s: %d stok\n", 
            menuCust.inventory[i].name, 
            menuCust.inventory[i].stock);
            sc.nextLine();
            Main.homepageOwner();
            return;
        }
    }
}
    static void tambahStok() {
    Scanner sc = new Scanner(System.in);
    System.out.println("=== TAMBAH STOK BAHAN ===");
    
    // Tampilkan stok saat ini dulu
    System.out.println("\nStok saat ini:");
    for (int i = 0; i < menuCust.inventory.length; i++) {
        System.out.printf("%d. %s: %d\n", i+1, menuCust.inventory[i].name, menuCust.inventory[i].stock);
    }
    
    System.out.print("\nPilih nomor bahan (1-" + menuCust.inventory.length + "): ");
    int pilihan = sc.nextInt() - 1;  // Index 0-based
    
    if (pilihan >= 0 && pilihan < menuCust.inventory.length) {
        System.out.print("Jumlah tambah stok: ");
        int tambah = sc.nextInt();
        
        // UPDATE STOK YANG DI ADD
        menuCust.inventory[pilihan].stock += tambah;
        
        System.out.printf("Stok %s bertambah %d → Total: %d\n", 
        menuCust.inventory[pilihan].name, tambah, 
        menuCust.inventory[pilihan].stock);
    } else {
        System.out.println("Pilihan tidak valid!");
    }
    
    System.out.println("Press Enter to go back to homepage...");
    sc.nextLine(); 
    Main.homepageOwner();
}

}

