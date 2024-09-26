package com.example.project;
import java.util.Scanner;

public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        //COPY AND PASTE YOUR CODE HERE 
        //Calculations for tip, total bill before tip, cost per person, tip per person, and total per person
        //I learned how to round from https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round
        /*Math.round() rounds decimals to the nearest whole number 
        How I used Math.round() to round tip, cost per person, tip per person, and total per person to the nearest hundredth:
        1. I multipled the numbers by 100.0 to shift two decimal places to the right
        2. Then, I rounded the numbers using Math.round() to leave only my non-decimal places left
        3. Lastly, I divided the numbers by 100.0 to shift back two decimal places to the left, giving me a decimal rounded to the nearest hundredth
        */

        double tip = cost*(percent/100.0);
        double tipRounded = (Math.round(tip*100.0))/100.0;
        double billWithTip = cost + tipRounded;
        double costPerPerson = cost/people;
        double costPerPersonRounded = (Math.round(costPerPerson*100.0))/100.0;
        double tipPerPerson = tip/people;
        double tipPerPersonRounded = (Math.round(tipPerPerson*100.0))/100.0;
        double totalPerPerson = (cost + tip)/people;
        double totalPerPersonRounded = (Math.round(totalPerPerson*100.0))/100.0;


        //Prints out tip, total bill before tip, cost per person, tip per person, and total per person
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tipRounded + "\n");
        result.append("Total Bill with tip: " + "$" + billWithTip + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPersonRounded +"\n");
        result.append("Tip per person: " + "$" + tipPerPersonRounded + "\n");
        result.append("Total cost per person: " + "$" + totalPerPersonRounded + "\n");
        result.append("-------------------------------\n");

        //the two lines should go below result.append("-------------------------------\n");

        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people;
        int percent;
        double cost;
        String items; 

        //Your scanner object and while loop should go here
        //Keeps adding to userItem until -1 is typed. Then, itemList will be set to userItem and be printed in the console. 

        String itemList = ""; //Will store all of the items
        String userItem = " "; //Will store latest item user typed  
        while(!userItem.equals("-1")){ 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an item or type '-1' to finish: "); 
            userItem = sc.nextLine(); //userItem whatever the user types
            if(!userItem.equals("-1")){ //if userItem is not -1, it'll be stored in itemList. If it is -1, it'll not be added in itemList and the loop will end after this
                itemList = itemList + "\n" + userItem; 
            }
        }
        items = itemList;

        System.out.println(calculateTip(2,5,29.56,items));
    }
}
