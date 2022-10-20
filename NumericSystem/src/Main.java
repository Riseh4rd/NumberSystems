import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
boolean ended = false;


           System.out.print("Please enter number and it number system: ");
           Scanner In = new Scanner(System.in);
           String input = In.nextLine();
           String[] words = input.split(" ");



           String number = words[0];
           int system = Integer.parseInt(words[1]);


        while (!ended){

           switch (system) {
               case 2:
                  int number1= Integer.parseInt(number,2);
           System.out.println("\nOctal(8): " + Long.toString(number1, 8) + "\nDecimal(10):" + Long.toString(number1, 10) + "\nHexadecimal(16): " + Long.toString(number1, 16));
                   ended = true;      break;
           case 8:
               number1= Integer.parseInt(number,8);
           System.out.println("Binary(2): " + Long.toString(number1, 2) + "\nDecimal(10):" + Long.toString(number1, 10) + "\nHexadecimal(16): " + Long.toString(number1, 16));
               ended = true;   break;
           case 10:
               number1= Integer.parseInt(number,10);
           System.out.println("Binary(2): " + Long.toString(number1, 2) + "\nOctal(8): " + Long.toString(number1, 8) + "\nHexadecimal(16): " + Long.toString(number1, 16));
               ended = true;   break;
           case 16:
               number1= Integer.parseInt(number,16);
           System.out.println("Binary(2): " + Long.toString(number1, 2) + "\nOctal(8): " + Long.toString(number1, 8) + "\nDecimal(10):" + Long.toString(number1, 10));
               ended = true; break;

       }


    }
}}