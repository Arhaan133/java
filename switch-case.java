class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char operator = '+';

        switch (operator) {
            case '+': System.out.println("Sum: " + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/': System.out.println("Quotient: " + (a / b)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}




// 🔹 switch-case

// switch (variable) {
//    case value1:
//        // code
//        break;
//    case value2:
//        // code
//        break;
//    default:
//        // code
// }
