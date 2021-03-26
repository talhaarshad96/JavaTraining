package com.nisum.training;

public class Vehicle
{
    String bodyShape;
    int WheelCount;
    int EnginePower;

    Vehicle(String bodyShape, int WheelCount, int EnginePower) //car ki class banao //String bs, int wheel, int power
    {
        this.bodyShape=bodyShape;
        this.WheelCount=WheelCount;
        this.EnginePower=EnginePower;
    }

    public void informationVehicle()
    {
        System.out.println("Vehicle " + "BodyShape "+bodyShape+" WheelCount "+WheelCount+" engine "+EnginePower);
    }
}

class Car extends Vehicle
{
    int tankCapacity;

    Car(String bodyShape, int WheelCount, int EnginePower,int tankCapacity)
    {
        super(bodyShape, WheelCount, EnginePower);
        this.tankCapacity=tankCapacity;
    }

    public void informationCar()
    {
        System.out.println("Car " + "BodyShape "+bodyShape+ " WheelCount "+WheelCount+" EnginePower "+EnginePower+" tankCapacity "+tankCapacity);
    }
}

class truck extends Vehicle
{
    int weightLift;

    truck(String bodyShape, int WheelCount, int EnginePower,int weightLift)
    {
        super(bodyShape, WheelCount, EnginePower);
        this.weightLift=weightLift;
    }

    public void informationTruck()
    {
        System.out.println("Truck " + "BodyShape "+bodyShape+ " WheelCount "+WheelCount+" EnginePower "+EnginePower +" weightLight "+ weightLift);
    }
}
