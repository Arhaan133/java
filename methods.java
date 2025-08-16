class MethodDemo {
    void greet() {
        System.out.println("Hello, Arhaan!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        MethodDemo obj = new MethodDemo();
        obj.greet();                      // Hello, Arhaan!
        obj.greet("Shaikh");             // Hello, Shaikh!
        System.out.println(obj.square(5));  // 25
    }
}


class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


class Calculator1 {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method 3: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call all overloaded methods
        System.out.println("add(int, int): " + calc.add(10, 20));               // 30
        System.out.println("add(double, double): " + calc.add(5.5, 3.2));       // 8.7
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));         // 6
    }
}



// add(int, int): 30  
// add(double, double): 8.7  
// add(int, int, int): 6


// ✅ 1. Concept Brief
// A method in Java is a block of code that performs a specific task.

// 🔹 Syntax:

// returnType methodName(parameters) {
//     // code
//     return value;
// }
// Example:


// int add(int a, int b) {
//     return a + b;
// }
// 🔹 Types of Methods:
// Predefined: System.out.println()

// User-defined: Your own methods

// 🧠 Interview MCQ
// 📌 Q: Can we overload a method by changing only the return type?

// A. Yes
// B. No
// ✅ Answer: B. No

// Reason: Method signature must differ in parameter number or type, not just return type.

//  Extra Tip
// You can also try overloading with different parameter order, like:

// void display(int a, String b) {}
// void display(String a, int b) {}  // ✅ Valid overloading