package Assignment4.Polymorphism;

public class Animal
{
    public String sounds()
    {
        return "Any sound";
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1.sounds());

        Animal animal2 = new Dog();


        System.out.println(animal2.sounds());

    }

}
