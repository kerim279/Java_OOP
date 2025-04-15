import java.util.ArrayList;

public class MainClass {
    /*public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();

        animal.add(new Dog("Rex"));
        animal.add(new Cat("Maca"));

        for (Animal a : animal){
            System.out.println("Name: " + a.getName());
            a.makeSound();
            if (a instanceof Dog){
                ((Dog) a).fetch();
            } else if (a instanceof Cat) {
                ((Cat) a).purr();

            }

            System.out.println();
        }
    }*/

    /*public static void main(String[] args) {
        ArrayList<Playable> instruments = new ArrayList<>();
        instruments.add(new Guitar("Fender"));
        instruments.add(new Piano("Bösendorfer"));
        instruments.add(new Drum("Tama"));

        for (Playable instrument: instruments){
            instrument.play();

            if (instrument instanceof Guitar){
                Guitar guitar = (Guitar) instrument;
                System.out.println("Brand: " + guitar.getBrand());
            } else if (instrument instanceof Piano) {
                Piano piano = (Piano) instrument;
                System.out.println("Brand: " + piano.getBrand());
            } else if (instrument instanceof Drum) {
                Drum drum = (Drum) instrument;
                System.out.println("Brand: " + drum.getBrand());
            }
        }
    }*/

    /*public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle("Blue", 5);
        Rectangular rectangular = new Rectangular("Red", 10, 5);

        shapes.add(circle);
        shapes.add(rectangular);

        for (Shape shape : shapes){
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.getArea());

            if (shape instanceof Circle){
                System.out.println("This is a Circle.");
            } else if (shape instanceof Rectangular) {
                System.out.println("This is a Rectangle");
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Developer developer = new Developer("Ibrahim", 2000.00, "Java");
        Menager menager = new Menager("Hamo", 3500.00, "10");

        employees.add(developer);
        employees.add(menager);

        for (Employee employee : employees){
            System.out.println(employee.generateReport());

            System.out.println("Bonus: " + employee.calculateBonus());
            System.out.println();
        }
    }
}
