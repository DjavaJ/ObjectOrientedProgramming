package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/14/17.
 */
public class InventoryItem {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<InventoryItem> vList = new ArrayList<>();


    String make;
    String model;
    int quantity;

    public void Vehicle(String make, String model, int quantity) {
        this.make = make;
        this.model = model;
        this.quantity = quantity;
    }



        }


