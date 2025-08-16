// basic array code
class ArrayBasics1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}



// Reverse an array example
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Reversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}



// max and min array code

class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {25, 5, 78, 3, 19, 45};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

// Maximum: 78  
// Minimum: 3



// Take 5 Numbers as Input, Store in Array & Print Sum
import java.util.Scanner;

class SumOfArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // take input
            sum += arr[i];          // add to sum
        }

        System.out.println("Sum of the entered numbers: " + sum);
        //sc.close();
    }
}

// Enter 5 numbers:  
// 10 20 30 40 50  
// Sum: 150


//  1. Concept Brief
// An array is a container object that holds multiple values of the same type.

// 🔹 Declaration:

// int[] arr = new int[5];         // array of size 5
// int[] arr = {1, 2, 3, 4, 5};    // array with values
// Indexing starts from 0

// Fixed size (not dynamic like ArrayList)

//  4. Interview MCQ
// 📌 Q: What happens if you try to access an array index that doesn’t exist?

// A. Compiler error
// B. Index is ignored
// C. Runtime exception
// D. Default value returned

// ✅ Answer: C. Runtime exception (ArrayIndexOutOfBoundsException)

