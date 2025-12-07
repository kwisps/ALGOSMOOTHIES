package algosmoothie;
import java.util.*;

public class menuCust {

// buat dapetin nama fruit nya untuk di receipt
private static String orderedFruit = "";
     
public static String getOrderedFruit(){
        return orderedFruit;
}
public static void setOrderedFruit(String fruit){
        menuCust.orderedFruit = fruit;
}

// kalkukasi semua harga (FRUIT, SIZE, TOPPING, BASE DAN SUBTOTAL)
private static int fruitPrice = 0, sizePrice = 0, toppingPrice = 0, 
basePrice = 0, subtotal = 0;

public static int getSubtotal() { 
    return subtotal; 
} public static void setFruitPrice(int price) { 
    fruitPrice = price; 
}
public static void setSizePrice(int price) {
    sizePrice = price; 
}
public static void setToppingPrice(int price) {
    toppingPrice = price; 
}
public static void setBasePrice(int price) {
    basePrice = price; 
}


    // QUEUE & STACK
    public static ArrayList<String> orderQueue = new ArrayList<>();
    public static Stack<String> orderStack = new Stack<>();

    static class Fruit {
        int id; String name; int price;
        
        Fruit(int id, String name, int price){
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
    static Fruit[] fruits = {
        new Fruit(1, "Mango", 10),
        new Fruit(2, "Strawberry", 10),
        new Fruit(3, "Banana", 12),
        new Fruit(4, "Blueberry", 15),
        new Fruit(5, "Watermelon", 15)
        };

 private static int currentFruitId = 0;
    public static int getCurrentFruitId() { 
        return currentFruitId; 
    }
    public static void setCurrentFruitId(int id) { 
        currentFruitId = id; 
    }

    static void menufruit() {
    Scanner sc = new Scanner(System.in);
        System.out.println("--------------- MENU -------------");
        System.out.printf("%-10s %-15s %8s\n", "Code", "Fruit", "Price");
        
        /*System.out.printf("%-10s %10s\n", "1. Mango" , "10$");
        System.out.printf("%-10s %7s\n", "2. Strawberry" , "10$");
        System.out.printf("%-10s %10s\n", "3. Banana" , "12$"); 
        System.out.printf("%-10s %8s\n", "4. Blueberry" , "15$");
        System.out.printf("%-10s %7s\n", "5. Watermelon" , "15$");
        System.out.println();*/
        for(Fruit f : fruits){
            System.out.printf("%-8d %-15s %6d$\n", f.id, f.name, f.price);
        }
        System.out.println("0. return to homepage");
        System.out.println();
        System.out.print("Choose 1 (by Code): ");
        int choice = sc.nextInt();
        System.out.println("You chose " + getFruitName(choice));
        switch (choice) {
            case 1: 
                // System.out.println("You chose " + getFruitName(choice));
                setOrderedFruit("MANGO");
                setCurrentFruitId(1);
                setFruitPrice(10);  
                break;
            case 2:
                // System.out.println("You chose " + getFruitName(choice));
                setOrderedFruit("STRAWBERRY");
                setCurrentFruitId(2);
                setFruitPrice(10);
                break;
            case 3:
            // System.out.println("You chose " + getFruitName(choice));
                setOrderedFruit("BANANA");
                setCurrentFruitId(3);
                setFruitPrice(12);
                break;
            case 4:
            // System.out.println("You chose " + getFruitName(choice));
                setOrderedFruit("BLUEBERRY");
                setCurrentFruitId(4);
                setFruitPrice(15);
                break;
            case 5:
            // System.out.println("You chose " + getFruitName(choice));
                setOrderedFruit("WATERMELON");
                setCurrentFruitId(5);
                setFruitPrice(15);
                break;
            
            default:
            throw new AssertionError();
            
        }        
        chooseSize();

    }
    static void chooseSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Drink Size -----");
        System.out.printf("%-10s %10s\n", "1. Regular" , " + 0$");
        System.out.printf("%-10s %10s\n", "2. Large" , " + 3$");
        System.out.print("Choose drink size (by number): "); 
        int drinkSize = sc.nextInt();

        System.out.println("You chose : " + getSize(drinkSize));
        if(drinkSize == 1){
            setSizePrice(0);    // Regular = 0
        } else {
        setSizePrice(3);    // Large = 3
        }
        System.out.println();
        chooseSugarlevel();
    sc.close();
    }

    static void chooseSugarlevel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sugar Level ===");
        System.out.println("1. No Sugar");
        System.out.println("2. Less Sugar");
        System.out.println("3. Normal");
        System.out.println("4. Extra Sugar");
        System.out.print("Choose sugar level (by number): ");
        int sugar = sc.nextInt();

        System.out.println("You chose : " + getSugar(sugar));
        System.out.println();
        chooseTopping();

        sc.close();
    }
    static void chooseTopping(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Topping =====");
        System.out.printf("%-10s %9s\n", "1. Chia Seed" , " + 2$");
        System.out.printf("%-10s %8s\n", "2. Whip Cream" , " + 3$"); 
        System.out.printf("%-10s %11s\n", "3. Jelly" , " + 4$");
        System.out.printf("%-10s\n", "4. No Topping");
        System.out.print("Choose topping (by number): ");
        int topping = sc.nextInt();

        System.out.println("You chose : " + getTopping(topping));

        switch (topping) {
            case 1: setToppingPrice(2); 
            break;  // Chia = 2
            case 2: setToppingPrice(3); 
            break;  // Whip = 3
            case 3: setToppingPrice(4); 
            break;  // Jelly = 4
            default: setToppingPrice(0); 
            break; // No topping = 0
    }
        System.out.println();
        chooseBase();

    }
    static void chooseBase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Base Milk =====");
        System.out.println("1. Full Cream      $2");
        System.out.println("2. Low Fat Milk    $3");
        System.out.println("3. Oat Milk        $5");
        System.out.println("4. Almond Milk     $5");
        System.out.println("5. Yogurt          $5");
        System.out.println("6. No Base Milk    $0");
        System.out.print("Choose Base Milk (by number): ");
        int baseMilk = sc.nextInt();

        System.out.println("You chose : " + getBase(baseMilk));
        
        switch (baseMilk) {
        // nyimpen harga base
        case 1: setBasePrice(2); 
        break;
        case 2: setBasePrice(3); 
        break;
        default: setBasePrice(5); 
        break; // Oat/Almond/Yogurt = 5
        case 6: setBasePrice(0); 
        break;
    }
        System.out.println();

        chooseIce();

        } 
    
    static void chooseIce(){
    Scanner sc = new Scanner(System.in);
    System.out.println("== ICE LEVEL ==");
    System.out.println("1. No Ice\n2. Less Ice\n3. Normal Ice\n4. Extra Ice");
    System.out.print("Choose ice level: ");
    int iceLevel = sc.nextInt();
    System.out.println("You Chose : " + getIce(iceLevel));

    // HITUNG SUBTOTAL
    subtotal = fruitPrice + sizePrice + toppingPrice + basePrice;
    
    // STRING ORDER SEDERHANA (tanpa nomor urut)
    String order = getOrderedFruit() + " SMOOTHIE ($" + 
                   fruitPrice + " +$" + sizePrice + " +$" + toppingPrice + 
                   " +$" + basePrice + " = $" + subtotal + ")";
    
    // ADD KE QUEUE & STACK
    orderQueue.add(order);
    orderStack.push(order);

    // ORDER SUMMARY
    System.out.println("\n=== ORDER SUMMARY === "); 
    System.out.println("You Ordered " + getOrderedFruit() + " : $" + fruitPrice);
    System.out.println("Cup Size: $" + sizePrice);
    System.out.println("Topping: $" + toppingPrice);
    System.out.println("Base: $" + basePrice);
    System.out.println("SUBTOTAL: $" + subtotal);
    System.out.println("Cart Size : " + orderQueue.size());
    System.out.println("==================");
    System.out.println("1. Order Again");
    System.out.println("2. Payment");
    System.out.print("Choose: ");
    
    int choice = sc.nextInt();
    if(choice == 1) {
        System.out.println("Cart updated! (" + orderQueue.size() + " items)\n");
        menufruit();
    } else {
        Payment.payment();
    }
}
    
    
     static String getFruitName(int num) {
        switch(num) {
            case 1: return "Mango";
            case 2: return "Strawberry";
            case 3: return "Banana";
            case 4: return "Blueberry";
            case 5: return "Watermelon";
            default: return "Unknown Fruit";
        }
    }
    static String getSize(int num) {
        switch(num) {
            case 1: return "Regular Size";
            case 2: return "Large Size";
            default: return "Unknown Fruit";
        }
    }
    static String getSugar(int num) {
        switch(num) {
            case 1: return "No Sugar";
            case 2: return "Less Sugar";
            case 3: return "Normal Sugar";
            case 4: return "Extra Sugar";
            default: return "Unknown Fruit";
        }
    }
    static String getTopping(int num) {
        switch(num) {
            case 1: return "Chia Seed";
            case 2: return "Whip Cream";
            case 3: return "Jelly";
            default : return "No Topping";
        }
    }
    static String getBase(int num) {
        switch(num) {
            case 1: return "Full Cream";
            case 2: return "Low Fat Milk";
            case 3: return "Oat Milk";
            case 4: return "Almond Milk";
            case 5: return "Yogurt";
            default: return "No Base Milk";
        }
    }
    static String getIce(int num) {
        switch(num) {
            case 1: return "No Ice";
            case 2: return "Less Ice";
            case 3: return "Normal Ice";
            case 4: return "Extra Ice";

            default: return "ERROR";
        }
    }
}
    
