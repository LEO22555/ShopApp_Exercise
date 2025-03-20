/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Leonardo
 */
public class ShopApp {

    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 14);

//        c1.setName("Pinky");
//        c1.setSize("S");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        items[2].description = "Green Scarf";
        items[2].price = 5.0;
        items[2].size = "M";

        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";

//        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price * 2) * (1 + tax);
//        
//        System.out.println("The whole price is " + total);    
        int measurement = 8;

        c1.addItems(items);

//        c1.setSize(measurement);
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
            System.out.println("Items: " + item.getDescription());
        }

    }

}