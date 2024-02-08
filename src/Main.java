import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = "My name is devshree.My place of work is my home";
        String x = scan.next();
        int count = 0;
        String[] s = n.split(" ");//separated words using split of string
        try {
//            for (int i = 0; i < s.length; i++) {
//                System.out.println(s[i]);
//            }
            if (n.contains(x)) {
                //System.out.println("found");
                count++;
            }
            if (count == 0) {//if no occurrence is found then custom exception is thrown
                throw new CustomException("No occurrence found");

            }
            System.out.println(count);//printing the occurrence
        } catch (CustomException e) {//create object of custom exception
            System.out.println(e.getMessage());//if no string is found then it returns null
        }
    }
}