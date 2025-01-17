 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taxandbill;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TaxAndBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Program program = new Program();
        do{
        System.out.println("Choose one of the following options:");
        System.out.println("1. Enter a list of employees");
        System.out.println("2. Display tax information");
        System.out.println("3. Search an employee by code");
        System.out.println("0. Exit");
        System.out.println("Your selection (0 -> 3):");
        int option = Integer.parseInt(sc.nextLine());
        
        switch(option){
            case 0:
                return;
            case 1:
                program.input();
                break;
            case 2: 
                program.display();
                break;
            case 3:
                program.search();
                break;
            }    
        }while(true);
    }
}