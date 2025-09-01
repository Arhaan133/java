// 📘 Concepts to Learn

// What is inheritance in Java?

// extends keyword

// Types of inheritance (Single, Multilevel, Hierarchical)

// super keyword (calling parent constructor/method)

// Method overriding


// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";

        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}


// Tommy is eating...
// Tommy is barking...
