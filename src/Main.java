import Homevork6.Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("apple", "mAir", "silver", 1000));
        laptops.add(new Laptop("dell", "7410", "black", 1250));
        laptops.add(new Laptop("hp", "556688", "gold", 1200));
        laptops.add(new Laptop("lenovo", "ckarbon", "black", 1300));

        filterLaptops(laptops);
    }

    public static void filterLaptops(Set<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Enter (1 - brand or 2 - color): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter brand: ");
            String brand = scanner.next().toLowerCase();
            filters.put("brand", brand);

        } else if (choice == 2) {
            System.out.println("Enter color: ");
            String color = scanner.next().toLowerCase();
            filters.put("color", color);
        } else {

            System.out.println("incorrect input");
            return;
        }


        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (filters.containsKey("brand") && !laptop.getBrand().equals(filters.get("brand"))) {
                continue;
            }
            if (filters.containsKey("color") && !laptop.getColor().equals(filters.get("color"))) {
                continue;
            }
            filteredLaptops.add(laptop);
        }

        System.out.println("laptops: ");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.getBrand().toUpperCase() + " " + laptop.getModel() + " " + laptop.getPrice() + "$ " + laptop.getColor());
        }
    }
}
