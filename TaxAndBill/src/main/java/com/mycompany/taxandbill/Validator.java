package com.mycompany.taxandbill;


import com.mycompany.taxandbill.Employee;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public  class Validator {
    public Validator(){
        
    };
    static Scanner sc = new Scanner(System.in);
    public static int InputCode(ArrayList<Employee> empList){
        int code = 0;
        while(true){
            System.out.print("Enter code (0 to stop): ");
            code = inputInt();
            boolean exi = false;
            for(Employee em : empList){
                if(em.getCode() == code){
                    System.out.println("Code existed!");
                    exi = true;
                    break;
                }
            }
            if(!exi)
                break;
        }
        return code;
    }
    public static int inputInt(){
        int num;
        while(true){
            try{
                num = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Incorrect format!");
                System.out.println("Enter again:");
                continue;
            }
            return num;
        }
    }
    public static String inputString(){
        
        String str; 
        do{
            str = sc.nextLine();
        }while(str.length() == 0);
        return str;
    }
    public static double inputMoney(){
        double money;
        do{
            try{
                money = Double.parseDouble(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Incorrect format!");
                System.out.println("Enter again: ");
                continue;
            }
            break;
        }while(true);
        return money;
    }
    
    public static char inputVerify(){
        do{
            String check = sc.nextLine();
            if(check.length()>1 || (check.charAt(0)!= 'y' && check.charAt(0) != 'n')){
                System.out.println("Incorrect format!");
                System.out.println("Enter again: ");
                continue;
            }
            return check.charAt(0);
        }while(true);
    }
}
