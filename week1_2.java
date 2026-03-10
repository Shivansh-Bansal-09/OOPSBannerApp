import java.util.Scanner;

public class week1_2 {
    public static void main(String[] args) {

        // Q1: Average of three marks
        int maths = 94;
        int physics = 96;
        int chem = 96;
        int total = maths + physics + chem;
        int average = total / 3;
        System.out.println("Average of three number scored : " + average);

        // Q2: Age calculation
        int birthyear = 2000;
        int curage = 2024 - birthyear;
        System.out.println("Harry current age is: " + curage);

        // Q3: Pen distribution
        int totalpen = 14;
        int penleft = totalpen % 3;          // remaining pens
        int perperson = totalpen / 3;        // pens per student
        System.out.println("The pen per student: " + perperson);
        System.out.println("Remaining pen: " + penleft);

        // Ek hi Scanner use karo poore program me
        Scanner sc = new Scanner(System.in);

        // Q4: Basic calculator (float)
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition of " + number1 + " and " + number2 + " is: " + addition);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + subtraction);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is: " + multiplication);
        System.out.println("The division of " + number1 + " and " + number2 + " is: " + division);

        // Q5: Feet to yards and miles
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;      // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760.0;  // 1 mile = 1760 yards

        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        // Q6: Swap two numbers (int)
        System.out.print("Enter first number to swap: ");
        int numer1 = sc.nextInt();

        System.out.print("Enter second number to swap: ");
        int numer2 = sc.nextInt();

        int temp = numer1;
        numer1 = numer2;
        numer2 = temp;

        System.out.println("The swapped numbers are " + numer1 + " and " + numer2);

        sc.close();
    }
}