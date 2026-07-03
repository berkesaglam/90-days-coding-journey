import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2WhatToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        hava sıcaklığı al
        sıcaklık 30 ve üzeri ise yüzme öner
        5 ve 30 arası sinema öner
        4 ve altına kayak öner
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the tempereture: ");
        int temp = scan.nextInt();
        
        if(temp >= 30) {
            System.out.println("You should go swimming.");
            
        }
        else if(temp >= 5 && temp < 30) {
            System.out.println("You should go to the cinema.");
        }
        else {
            System.out.println("You should go skiing.");
        }
        scan.close();
    }
    
}
