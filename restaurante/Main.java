package restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Item item = new Item("Fanta", "refrigerante", 5.5);

        System.out.println(item);
    }
}