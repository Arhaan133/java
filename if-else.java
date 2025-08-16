class GradeCheck {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
    }
}


//  5. MCQ for Interview
// 📌 Q: What is the output?

// java
// Copy
// Edit
// int a = 5;
// if (a == 5)
//     if (a > 3)
//         System.out.println("Hi");
//     else
//         System.out.println("Bye");
// ✅ Answer: Hi



// Java follows indentation but only matches else with the nearest unmatched if.//




import java.util.Scanner;

class DayChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number (0 to 6): ");
        int num = sc.nextInt();

        // Step 2: switch-case to print day of the week
        switch (num) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Invalid number! Please enter 0–6.");
        }

        // Step 3: Check if number is even or odd
        if (num >= 0 && num <= 6) {
            if (num % 2 == 0) {
                System.out.println("It's an Even number.");
            } else {
                System.out.println("It's an Odd number.");
            }
        }

        sc.close();
    }
}



//  Day 2: Control Flow in Java
// ✅ 1. Concept Brief
// Control flow allows your program to make decisions.

// 🔹 if, else if, else
// java
// Copy
// Edit
// if (condition) {
//    // code if true
// } else {
//    // code if false
// }