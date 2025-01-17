/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxandbill;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Program {

    private ArrayList<Employee> empList = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public Program() {
    }

    public void input() {
        int code, dependant;
        String name;
        double income, charity;
        char pension, health;

        System.out.println("Enter financial information for employees:");
        while (true) {
            System.out.println("");
            System.out.println("Enter personal information:");

            code = Validator.InputCode(empList);
            if (code == 0) {
                break;
            }
            System.out.print("Enter name: ");
            name = Validator.inputString();
            System.out.print("Income for the current month (in thousand VND): ");
            income = Validator.inputMoney();
            System.out.print("Pension contributions (5%) y/n? ");
            pension = Validator.inputVerify();
            System.out.print("Health insurance (1%) y/n? ");
            health = Validator.inputVerify();
            System.out.print("Number of dependants < 18 years old: ");
            dependant = Validator.inputInt();
            System.out.print("Gift of charity: ");
            charity = Validator.inputMoney();
            Employee em = new Employee(code, name, income, pension, health, dependant, charity);
            empList.add(em);
        }
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
            sc.nextLine();
        }  
        catch(Exception e)
        {}  
    }

    public void display() {
        System.out.printf("%5s%10s%7s%7s%6s%6s%8s%10s%13s%9s%10s\n", "code", "name", "income", "allow", "pens", "ins", "charity", "depend", "taxable", "tax", "net");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (Employee em : empList) {
            System.out.printf("%05d%10s%7.0f%7.0f%6.0f%6.0f%8.0f%10.0f%13.0f%9.0f%10.0f\n", em.getCode(), em.getName(), em.getIncome(), em.getAllow(), em.getPens(), em.getIns(), em.getCharity(), em.getDepend(), em.getTaxable(), em.getTax(), em.getNet());
        }
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
            sc.nextLine();
        }  
        catch(Exception e)
        {}  
    }

    public void search() {
        System.out.println("Enter code to be searched: ");
        int code = Integer.parseInt(sc.nextLine());
        int i = 0;
        for (i = 0; i < empList.size(); i++) {
            Employee em = empList.get(i);
            if (em.getCode() == code) {
                System.out.printf("Found at position: %d", i);
                System.out.printf("%5s%10s%7s%7s%6s%6s%8s%10s%13s%9s%10s\n", "code", "name", "income", "allow", "pens", "ins", "charity", "depend", "taxable", "tax", "net");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%5d%10s%7.1f%7.1f%6.1f%6.1f%8.1f%10.1f%13.1f%9.1f%10.1f\n", em.getCode(), em.getName(), em.getIncome(), em.getAllow(), em.getPens(), em.getIns(), em.getCharity(), em.getDepend(), em.getTaxable(), em.getTax(), em.getNet());
            }
        }
        System.out.println("No employee found!");
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
            sc.nextLine();
        }  
        catch(Exception e)
        {}  
    }
}
