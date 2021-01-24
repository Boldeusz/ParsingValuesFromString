package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberString = "2020";
        System.out.println("numberString= " +numberString);

        int number = Integer.parseInt(numberString);
        System.out.println(number);

        numberString += 1;
        number += 1;

        System.out.println("numberString= " +numberString);
        System.out.println(number);

    }
}
