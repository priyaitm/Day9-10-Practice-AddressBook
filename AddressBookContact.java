package assignment.bridge.lab;

import java.util.Scanner;

public class AddressBookContact {
    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Contacts!!");
        java.util.Scanner Scanner = new Scanner(System.in);
        System.out.print(" contacts details: ");


        String[] first_name = new String[1];
        String[] last_name = new String[1];
        String[] address_name = new String[1];
        String[] city_name = new String[1];
        String[] state_name = new String[1];
        int[] zip_num = new int[1];
        long[] phone_num = new long[1];


        System.out.println("Enter First name:");
        first_name[0] = Scanner.next();

        System.out.println("Enter last name:");
        last_name[0] = Scanner.next();

        System.out.println("Enter Address name:");
        address_name[0] = Scanner.next();

        System.out.println("Enter city name:");
        city_name[0] = Scanner.next();

        System.out.println("Enter state name:");
        state_name[0] = Scanner.next();

        System.out.println("Enter zip  number:");
        zip_num[0] = Scanner.nextInt();

        System.out.println("Enter phone number:");
        phone_num[0] = Scanner.nextLong();


        System.out.println(first_name[0] + "  " + last_name[0] + " " + address_name[0] + " " + city_name[0] + " " + state_name[0] + " " + zip_num[0] + " " + phone_num[0]);

    }
}





