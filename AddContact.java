package assignment.bridge.lab;

import java.util.Scanner;

public class AddContact {
    public static void main(String[] args) {
        java.util.Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the  contacts details: ");
        int contact_no=Scanner.nextInt();



        String[] first_name = new String[contact_no];
        String[] last_name = new String[contact_no];
        String[] address_name = new String[contact_no];
        String[] city_name = new String[contact_no];
        String[] state_name = new String[contact_no];
        int[] zip_num = new int[contact_no];
        long[] phone_num = new long[contact_no];

      for(int i=0;i<contact_no;i++) {
          System.out.println("Enter First name:");
          first_name[i] = Scanner.next();

          System.out.println("Enter last name:");
          last_name[i] = Scanner.next();

          System.out.println("Enter Address name:");
          address_name[i] = Scanner.next();

          System.out.println("Enter city name:");
          city_name[i] = Scanner.next();

          System.out.println("Enter state name:");
          state_name[i] = Scanner.next();

          System.out.println("Enter zip  number:");
          zip_num[i] = Scanner.nextInt();

          System.out.println("Enter phone number:");
          phone_num[i] = Scanner.nextLong();


          System.out.println(first_name[i] + "  " + last_name[i] + " " + address_name[i] + " " + city_name[i] + " " + state_name[i] + " " + zip_num[i] + " " + phone_num[i]);
      }
    }



}
