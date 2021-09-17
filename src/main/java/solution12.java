/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for principle amount of money
    prompt user for the roi
    prompt user for length in years
    calculate the formula for principle * roi + years
    display output for the roi on the investment


 */


import java.util.Scanner;

public class solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        String num1 = sc.nextLine();
        int p = Integer.parseInt("" + num1);

        System.out.println("Enter the rate of interest: ");
        String num2 = sc.nextLine();
        float roi = Float.parseFloat("" + num2);

        System.out.println("Enter the number of years: ");
        String num3 = sc.nextLine();
        int year = Integer.parseInt("" + num3);

        float total_roi = (roi/100 * year);

        float invest = (total_roi * p + p);

        System.out.println("After "+(year)+ " years at "+(roi)+"%, the investment will be worth $"+(invest)+"");




    }
}
