/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxandbill;

/**
 *
 * @author HP
 */
public class Employee {
    int code;
    String name;
    double income,pens,ins,charity,depend,taxable,tax,net;
    double allow = 4000;
    
    public Employee(){
        
    }
    public Employee(int code, String name, double income, char isPension, char isInsurance, int noDependant, double charity) {
        setCode(code);
        setName(name);
        setIncome(income);
        setPens(isPension);
        setIns(isInsurance);
        setDepend(noDependant);
        setCharity(charity);
        setTaxable();
        setTax();
        setNet();
    }

    public int getCode() {
        return code;
    }

    private void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    private void setIncome(double income) {
        this.income = income;
    }

    public double getAllow() {
        return allow;
    }

    public double getPens() {
        return pens;
    }

    private void setPens(char pens) {
        this.pens = (pens == 'y')?income*5/100:0;
    }

    public double getIns() {
        return ins;
    }

    private void setIns(char ins) {
        this.ins = (ins == 'y')?income*1/100:0;
    }

    public double getCharity() {
        return charity;
    }

    private void setCharity(double charity) {
        this.charity = charity;
    }

    public double getDepend() {
        return depend;
    }

    private void setDepend(int depend) {
        this.depend = 1000.0 * depend;
    }

    public double getTaxable() {
        return taxable;
    }

    private void setTaxable() {
        this.taxable = this.income-this.allow-this.pens-this.ins-this.charity-this.depend;
    }

    public double getTax() {
        return tax;
    }

    private void setTax() {
        this.tax = this.taxable*23.5/100;
    }

    public double getNet() {
        return net;
    }

    private void setNet() {
        this.net = this.income-this.tax;
    }

   
}
