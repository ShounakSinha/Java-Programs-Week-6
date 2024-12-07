class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog();  // Upcasting
        Animal myAnimal2 = new Cat();  // Upcasting

        myAnimal1.makeSound();  // Outputs: Dog barks
        myAnimal2.makeSound();  // Outputs: Cat meows
    }
}
