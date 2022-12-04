package src.cart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Item apple = new Item("apple", "Apple");
        // Item orange = new Item("orange", "Orange");

        // apple.setPrice(.5f);
        // apple.setQuantity(10);

        // orange.setPrice(.5f);
        // orange.setQuantity(10);

        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        Item item = new Item();

        Apple apple = new Apple();
        apple.setType("washington");

        Orange orange = new Orange();

        item.totalPrice();
        float sum = 0;

        while (!stop) {

            String input = cons.readLine("> ".trim());
            // info are the properties of item(input)
            String[] info = input.split(" ");

            switch (info[0]) {
                case "list":
                    if (cart.size() < 1) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("The contents of your cart:");
                        for (Integer i =0; i < cart.size(); i++)
                        System.out.printf("%d. %s\n", i + 1, cart.get(i));
                    }
                    break;

                case "add": // add apple orange etc
                    // Check if add has any items
                    
                    if (info.length < 4) {
                        System.out.println("Please include the following details in this order:");
                        System.out.println("Item name Quantity Price. (Example: apple 10 0.5)");
                        break;
                    }

                    item.setName(info[1]);
                    item.setQuantity(Integer.parseInt(info[2]));
                    item.setPrice(Float.parseFloat(info[3]));

                    if (cart.contains(info[1])) {
                        System.out.printf("Cart already has %s.\n", info[1]);
                        break;
                    } else {
                        cart.add(info[1]);
                        System.out.println(info[2] + " " + info[1] + "s added at $" + info[3] + " each.");
                        break;
                    }


                case "delete":
                    cart.remove(info[1]);
                    System.out.printf("%ss have been removed from cart\n", info[1]);
                    break;

                case "checkout":
                    for (int i = 0; i < cart.size(); i++) {
                        sum = sum + Float.parseFloat(cart.get(i));
                        System.out.println("sum is " + sum + "cart(i) is " + cart.get(i));
                    }
                    break;

                case "exit":
                    stop = true;
                    break;

                default:
                    System.out.printf("Unknown command: %s. \n Commands available are: add, list, delete, checkout and exit.\n", info[0]);
                    
            }
        }
        System.out.println("Thank you for shopping with us. Have a nice day!");
    }
}
