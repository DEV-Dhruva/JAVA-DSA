public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eats();

        // Dogs tommy = new Dogs();
        // tommy.legs = 4;
        // tommy.eats();
        // System.out.println(tommy.legs);
    }
}

class Animal {

    void eats() {
        System.out.println("Eatsss");
    }

    void breathe() {
        System.out.println("Breatheee");
    }
}

class Mammal extends Animal {
    // int legs;
    void walk(){
        System.out.println("Walk");
    }
}

class fish extends Animal {
    void Swim(){
        System.out.println("swim");
    }
}

class bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}

// class Dogs extends Mammal {
//     String breed;
// }

// class Fish extends Animal{
// void Swim(){
// System.out.println("Swimmm");
// }
// }
