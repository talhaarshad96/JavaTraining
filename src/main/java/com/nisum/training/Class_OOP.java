package com.nisum.training;

public class Class_OOP
{
    Class_OOP clas = new Class_OOP();
//    student stud = new student();

    public static void main(String[] args)
    {
        System.out.println("Student Class stuff\n");
        student stud = new student();
        stud.setName("Talha");
        stud.setRollnum(110);
        stud.setMarks(-1);


        System.out.println(stud.getName() +" "+ stud.getMarks());

        System.out.println("\n\nNow Vehicle Class stuff");
        Vehicle veh = new Vehicle("Jeep", 4, 660);
        Car veh1 = new Car("Mini Jeep", 4, 660,35);
        truck veh2 = new truck("truckk", 4, 800,2000);
        veh.informationVehicle();
        veh1.informationCar();
        veh2.informationTruck();
        veh2.informationVehicle();

    }
}
//make student class, has 3 variable name, roll num, marks, make sure when you set marks, less than 0 karun toh wo set
// na honi chaiye, toh exception throw karde.

