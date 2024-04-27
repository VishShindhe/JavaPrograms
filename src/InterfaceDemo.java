interface Animal {
    void makeSound(); // Method signature
}

// Implementing class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Implementing class
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Pet {
    public void talk(Animal a) {
        a.makeSound();
    }
}

public class InterfaceDemo {
    public static void main(String args[]){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Pet charlie = new Pet();
        charlie.talk(dog);
    }
}