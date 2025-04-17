public class Dog extends Canine
{
    //zad3
    @Override
    public void makeNoise()
    {
        System.out.println("I am a Dog");
    }

    //zad4
    @Override
    public void roam()
    {
        super.roam();
    }
}
