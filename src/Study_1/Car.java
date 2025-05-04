package Study_1;

public class Car extends Vehicle
{

    @Override
    public void hasEngine() {
        System.out.println("Has Engine");
    }

    @Override
    public void hasBrakes()
    {
        System.out.println("Has Brakes");
    }
}