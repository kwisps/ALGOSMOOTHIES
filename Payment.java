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
                }

            
        static void printReceipt(){
            int grandTotal = 0;
                    System.out.println("===== RECEIPT =====");
                    System.out.println("Order Number : " + orderCounter++);

                    // array list - queue
                    if (menuCust.orderQueue.isEmpty()){
                        System.out.println("No orders in cart!");
                    }

                    int Subtotal = 0;
                    System.out.println("Ordered Item : " );
                   
                        for(String order : menuCust.orderQueue) {
                        System.out.println(order);
        // Extract subtotal dari string atau langsung ambil menuCust.getSubtotal()
                        grandTotal += menuCust.getSubtotal() * menuCust.orderQueue.size();
    }
                    
            
                    System.out.println("Method : " + methodUsed);
                    System.out.println("Status : Paid");
                    System.out.println("=== THANK YOU FOR ORDERING ===");

                    
                 }
                
                }
