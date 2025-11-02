//parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

//derived class 1
class Dog extends Animal {
    // Method overriding
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    // Method overriding
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Task_3 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog(); 
        Animal a3 = new Cat();
        a1.makeSound(); 
        a2.makeSound(); 
        a3.makeSound(); 
    }
}