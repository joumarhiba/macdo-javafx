package com.simplon.macdo.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static final List<MenuItem> items = new ArrayList<>();

    static {
        items.add(new MenuItem("Big Mac", 3.99, true));
        items.add(new MenuItem("Quarter Pounder", 4.19, true));
        items.add(new MenuItem("McChicken", 1.89, false));
        items.add(new MenuItem("Filet-O-Fish", 3.79, true));
        items.add(new MenuItem("Chicken McNuggets", 1.69, false));
        items.add(new MenuItem("French Fries", 1.39, false));
        items.add(new MenuItem("Apple Pie", 0.99, false));
        items.add(new MenuItem("Soft Drink", 1.29, false));
    }

    public static List<MenuItem> getItems() {
        return items;
    }

    public static double getPrice(String name) {
        for (MenuItem item : items) {
            if (item.name().equals(name)) {
                return item.price();
            }
        }
        throw new IllegalArgumentException("Invalid menu item: " + name);
    }

    public static boolean hasDiscount(String name) {
        for (MenuItem item : items) {
            if (item.name().equals(name)) {
                return item.hasDiscount();
            }
        }
        throw new IllegalArgumentException("Invalid menu item: " + name);
    }
}
