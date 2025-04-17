public class Car extends Vehicle
{
    //zad1
    private int numberOfSeats;

    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    //zad2
    @Override
    public void start()
    {
        System.out.println("Car starts");
    }

    @Override
    public void stop()
    {
        System.out.println("Car stops");
    }

}
