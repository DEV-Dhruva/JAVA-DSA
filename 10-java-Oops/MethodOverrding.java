public class MethodOverrding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() { // method overrided
        System.out.println("Eatsss");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
