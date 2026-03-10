import java.util.Scanner;

public class week3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1: Check if a number is divisible by 5
        System.out.print("Enter a number to check divisibility by 5: ");
        int divNum = sc.nextInt();
        if (divNum % 5 == 0) {
            System.out.println("Is the number " + divNum + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + divNum + " divisible by 5? No");
        }

        // Q2: Check if first is the smallest of three numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Q3: Voting eligibility based on age
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Q4: Print odd and even numbers between 1 and N
        System.out.print("Enter a number (natural number) for odd/even listing: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            System.out.println("Even numbers between 1 and " + n + " are:");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("Odd numbers between 1 and " + n + " are:");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        // Q5: FizzBuzz from 1 to N
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int fb = sc.nextInt();
        if (fb <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            for (int i = 1; i <= fb; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // Q6: Count number of digits in an integer
        System.out.print("Enter an integer to count digits: ");
        int num = sc.nextInt();

        int count = 0;

        if (num < 0) {
            num = -num;
        }
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}