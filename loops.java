class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// *
// * *
// * * *
// * * * *   output



// ✅ 1. Concept Brief
// Java has 3 main loops:

// 🔹 for loop – when the number of iterations is known.

// for (int i = 1; i <= 5; i++) {
//     System.out.println(i);
// }
// 🔹 while loop – when the condition is checked before the block.

// int i = 1;
// while (i <= 5) {
//     System.out.println(i);
//     i++;
// }
// 🔹 do-while loop – runs at least once.

// int i = 1;
// do {
//     System.out.println(i);
//     i++;
// } while (i <= 5);


//  4. Interview MCQ
// 📌 Q: Which loop guarantees at least one execution of the loop body?

// A. for
// B. while
// C. do-while
// D. foreach

// ✅ Answer: C. do-while


// ✅ Day 3 Task Solutions
// 🔹 Task 1: Sum of first n numbers using while loop

// import java.util.Scanner;

// class SumUsingWhile {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0, i = 1;

//         while (i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum of first " + n + " numbers: " + sum);
//         sc.close();
//     }
// }
// 🔍 Example:

// Input: 5
// Output: Sum = 15
// 🔹 Task 2: Pattern

// 1
// 1 2
// 1 2 3
// 1 2 3 4

// class NumberPattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// 🔹 Task 3: Print numbers from 1 to 10 using do-while
// java

// class DoWhileExample {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 10);
//     }
// }



// 🔹 What does sum += i; mean?
// It’s a shorthand for:

// sum = sum + i;
// It adds the current value of i to sum, and stores the result back in sum.

// 🔍 Where & Why is it used?
// This line is used when you want to keep a running total — i.e., you're accumulating a sum as you loop.

// 💡 Example Breakdown:
// Let’s say n = 5 and the loop is:


// int sum = 0;
// int i = 1;
// while (i <= 5) {
//     sum += i;
//     i++;
// }
// Here’s what happens each time the loop runs:

// Loop	i	sum += i	Updated sum
// 1	1	0 + 1	1
// 2	2	1 + 2	3
// 3	3	3 + 3	6
// 4	4	6 + 4	10
// 5	5	10 + 5	15

// 🔚 After the loop ends:
// ✅ sum = 15

// ✅ When to Use +=:
// When you're adding repeatedly (like summing numbers, marks, salaries)

// You can also use other shorthand operators:

// x -= y; → x = x - y;

// x *= y; → x = x * y;

// x /= y; → x = x / y;

