package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(3);
        Room r104 = new Room(4);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for(Room r : rooms){
            System.out.println(r);
        }

        System.out.println();

        ArrayList<Reservation> reservation = new ArrayList<>();

        Reservation res1 = new Reservation("king", 2,false);//this is the argument
        Reservation res2 = new Reservation("double", 1,false);
        Reservation res3 = new Reservation("king", 1,false);
        Reservation res4 = new Reservation("king", 1,false);


        reservation.add(res1);
        reservation.add(res2);
        reservation.add(res3);
        reservation.add(res4);

        for(Reservation r : reservation){
            System.out.println(r);
        }

        System.out.println();

        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1,"ayah","IT",23,12);
        Employee emp2 = new Employee(1, "AYAH","IT",34,4);
        Employee emp3 = new Employee(1, "AYAH","IT",34,4);
        Employee emp4 = new Employee(1, "AYAH","IT",34,4);


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}