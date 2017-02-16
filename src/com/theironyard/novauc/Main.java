package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<InventoryItem> vList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static InventoryItem i = new InventoryItem();

    static InventoryItem createItem(String name, int quantity, String category) {

        String answer = InventoryItem.scanner.nextLine();
        if (3 == 3) {
            scanner.nextLine();
            return createItem("FordExplorer", 2, "Ford");
            if (createItem("FordExplorer", 2, "Ford").equals("FordExplorer"));
            System.out.printf ("FordExplorer", 2, "Ford").equals("FordExplorer");


        } else if (2==2){
            System.out.println("answer" + answer);
        }
        else {
            System.out.println();
        }
        return new FordFocus("me", "you", 2);
    }


    public static void main(String[] args) {

        vList.add(new FordExplorer("make", "model", 0));
        vList.add(new FordF150("make", "model", 0));
        vList.add(new FordFocus("make", "model", 0));
        vList.add(new FordFiesta("make", "model", 0));
        vList.add(new FordTaurus("make", "model", 0));






    }
}
