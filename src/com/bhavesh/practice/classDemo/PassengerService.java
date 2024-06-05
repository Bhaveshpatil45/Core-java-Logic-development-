package com.bhavesh.practice.classDemo;

import java.util.Scanner;

public class PassengerService {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("pls enter passenger data: ");

        System.out.println("please enter passenger name: ");
        String name = scan.nextLine();

        System.out.println("please enter passenger address: ");
        String address = scan.nextLine();

        System.out.println("please enter passenger age: ");
        int age = scan.nextInt();

        System.out.println("please enter passenger gender: ");
        String gender = scan.next();

        System.out.println("please enter passenger ticket price: ");
        int ticketPrice = scan.nextInt();

        System.out.println("please enter passenger luggage size: ");
        float luggageSize = scan.nextFloat();

        Passenger passenger = new Passenger();
        passenger.name = name;
        passenger.setAddress(address);
        passenger.setAge(age);
        passenger.gender = gender;
        passenger.setTicketPrice(ticketPrice);
        passenger.luggageSize = luggageSize;

        System.out.println("Passenger details are: " + passenger );

    }
}
