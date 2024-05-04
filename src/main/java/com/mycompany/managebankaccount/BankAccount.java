/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managebankaccount;

/**
 *
 * @author Student
 */
public class BankAccount {
    private int mAccNum;
    private String mFullName;
    private double mBalance;

    public BankAccount(int mAccNum, String mFullName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mFullName = mFullName;
        this.mBalance = mBalance;
    }

    public BankAccount() {
    }

    public int getAccNum() {
        return mAccNum;
    }

    public String getFullName() {
        return mFullName;
    }

    public double getBalance() {
        return mBalance;
    }
    public void deposit(double money){
        mBalance += money;
    }
    public boolean withdraw(double money){
        if (mBalance >= money){
            mBalance -= money;
            return true;
        }else{
            return false;
        }
    }    
    public boolean transferMoney(BankAccount acc, double money){
        if (acc.getAccNum() == mAccNum){
            return false;
        }
        if (mBalance >= money){
            acc.deposit(money);
            mBalance -= money;
            return true;
        }else{
            return false;
        }
    }
    public void print(){
        System.out.println("Acc Num: "+mAccNum+"\nFullName: "+mFullName+"\nBalance: "+mBalance);
    }
    
}
