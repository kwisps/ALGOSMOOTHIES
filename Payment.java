package algosmoothie;

import java.util.*;

public class Payment {

    private static String methodUsed = "";
    private static int orderCounter = 1;
     
    public static String getMethodUsed(){
        return methodUsed;
    }
    public static void setMethodUsed(String method){
        Payment.methodUsed = method;
    }
     static void payment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PAYMENT ===");
        System.out.println("1. QRIS");
        System.out.println("2. Transfer Bank");
        System.out.println("3. Cash");

            // Nested While Loop
            System.out.print("Select Payment Method : "); 
                if(sc.hasNextInt()){
                    int selectPay = sc.nextInt();
                    switch (selectPay) {
                        case 1: 
                        methodUsed = "QRIS";
                        break;
                        case 2:
                        methodUsed = "Transfer Bank";
                        break;
                        case 3:
                        methodUsed = "Cash";
                        break;
                        default:
                        System.out.println();;
                        break;            
                    }
                    System.out.println();
                    printReceipt();

                } else{
                    System.out.println("INPUT NUMBER");
                    payment();
                }
                sc.close();
                }

        static void printReceipt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========== RECEIPT ==========");
        System.out.println("Order Number: #" + orderCounter++);
    
        int grandSubtotal = 0;
        System.out.println("\n--- ORDERED ITEMS ---");
    
    // LOOP: Hitung subtotal dari semua item
        for(String order : menuCust.orderQueue) {
            System.out.println(order);
            grandSubtotal += menuCust.getSubtotal();  // Akumulasi semua subtotal
        }
    
    //  11% TAX CALCULATION
        double tax11Percent = grandSubtotal * 0.11;
        double grandTotal = grandSubtotal + tax11Percent;
    
    System.out.println("\n--- BILLING ---");
    System.out.printf("Subtotal: $%,d\n", grandSubtotal);
    System.out.printf("Tax (11%%): $%.2f\n", tax11Percent);    
    System.out.printf("\n TOTAL: $%.2f\n", grandTotal);      
    System.out.println("Payment Method: " + methodUsed);
    System.out.println("Status: PAID ");
    System.out.println("===========================\n");
    
    
    System.out.println("Press Enter to Exit");
    String enter = sc.nextLine();

    Main.main(null);

    sc.close();
}
}
