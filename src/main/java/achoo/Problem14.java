package achoo;
import java.util.*;
import java.text.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem14 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.print("What is the order amount? ");
        double amt = a.nextDouble();
        a.nextLine();
        System.out.print("What is the state? ");
        String ST = a.nextLine();
        if(ST.equals("WI")){
            System.out.print("Subtotal: "+nf.format(amt)+"\nTax: "+nf.format(.055*amt));
            amt = amt + (.055*amt);
        }
        System.out.println("Total: "+nf.format(amt));
    }
}
