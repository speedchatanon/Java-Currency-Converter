package com.currencyconverter;

import  java.io.*;
import java.util.*;
interface CurrencyInt {
   double DollarToInr(double Dollars, double ExchangeRate);
   double InrToDollar(double Inr, double ExchangeRate);
}

class Main implements CurrencyInt {
    public double DollarToInr(double Dollars, double ExchangeRate) {
        return Dollars * ExchangeRate;
    }

    public double InrToDollar(double Inr, double ExchangeRate) {
        return Inr / ExchangeRate;
    }
}

class CurrencyConverter {
    public static void main(String[] args) {
        int choice;
        double ExchangeRate;
        double dollar;
        double inr;
        char ans;
        Main cc = new Main();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("        MENU        ");
            System.out.println("---------------------");
            System.out.println("1. Dollar to Inr");
            System.out.println("2. Inr to Dollar");

            System.out.println("\n Enter your choice");
            choice = input.nextInt();

            System.out.println("\n Pls Enter current exchang rate :");
            ExchangeRate = input.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Enterno of Dollars");
                    dollar = input.nextDouble();

                    inr = cc.DollarToInr(dollar, ExchangeRate);
                    System.out.println(dollar + " dollar are equal to " + inr + " Rs");
                    break;
                case 2:
                    System.out.println("Enter no of Rupees");
                    inr = input.nextDouble();
                    dollar = cc.InrToDollar(inr, ExchangeRate);
                    System.out.println(inr + " rupees are equal to " + inr + " dollars");
                    break;
                default:
                    System.out.println("Wrong Choice, Try Again");
            }
            System.out.println("Do you want to Continue : (Y,N)");
            ans = input.next().charAt(0);
        } while (ans == 'y');
    }
}
