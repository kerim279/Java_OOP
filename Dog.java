public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

    public void fetch(){
        System.out.println(getName() + " fetches the ball.");
    }


}
