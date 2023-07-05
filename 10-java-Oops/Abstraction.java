public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang(); // myHorse object called Mustang constuctor
        myHorse.eat();

        // Animal a = new Animal(); // can't create instance/object of abstract class

    }
}

abstract class Animal { // abstract class
    Animal() {
        System.out.println("Aninmal constructor called");
    }

    void eat() { // non-abstract method
        System.out.println("Eatsss");
    }

    abstract void walk(); // abstract method-idea
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }

    void walk() { // abstract method-implementation
        System.out.println("horse walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken constructor called");
    }

    void walk() { // abstract method-implementation
        System.out.println("Chicken walk on 2 legs");
    }
}