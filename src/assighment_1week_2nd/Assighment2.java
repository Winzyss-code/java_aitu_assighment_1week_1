package assighment_1week_2nd;
import java.util.Scanner;


public class Assighment2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //Task1
        System.out.println("Task 1:");
        System.out.print("Enter outside temperature: ");
        int temp = console.nextInt();
        if (temp < 0)
            System.out.println("it's cold outside.");
        else
            System.out.println("it's warm outside.");

        //Task 2
        System.out.println("\nTask 2:");
        console.nextLine();
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.print("Enter your age: ");
        int age = console.nextInt();
        if (age >= 18 && age <= 28)
            System.out.println(name + ", come to the military registration and enlistment office");

        //Task3
        System.out.println("\nTask 3:");
        System.out.print("Enter body temperature: ");
        double bodyTemp = console.nextDouble();
        boolean isHigh = bodyTemp > 37;
        boolean isLow = bodyTemp < 36;
        if (isHigh)
            System.out.println("Body temperature is high");
        else if (isLow)
            System.out.println("Body temperature is low");
        else
            System.out.println("Body temperature is normal");

        //Task4
        System.out.println("\nTask 4:");
        System.out.print("Enter age: ");
        int a = console.nextInt();
        if (a < 20 || a > 60)
            System.out.println("you don’t have to work.");

        //Task5
        System.out.println("\nTask 5:");
        String quote = "I will never work for pennies.";
        int count = 0;
        while (count < 100) {
            System.out.println(quote);
            count++;
        }

        //Task6
        System.out.println("\nTask 6:");
        console.nextLine(); // clear buffer
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (or type ENTER to stop): ");
            String input = console.nextLine();
            if (input.equals("ENTER"))
                break;
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'ENTER'.");
            }
        }
        System.out.println("Sum = " + sum);

        //Task7
        System.out.println("\nTask 7:");
        int row = 0;
        while (row < 5) {
            int col = 0;
            while (col < 10) {
                System.out.print("Q");
                col++;
            }
            System.out.println();
            row++;
        }

        //Task8
        System.out.println("\nTask 8:");
        int i = 1;
        int total = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            total += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 100 not divisible by 3 = " + total);

        //Task9
        System.out.println("\nTask 9:");
        for (int j = 1; j <= 15; j++) {
            if (j % 2 == 0)
                System.out.println(j);
        }

        //Task10
        System.out.println("\nTask 10:");
        System.out.print("Enter start: ");
        int start = console.nextInt();
        System.out.print("Enter end: ");
        int end = console.nextInt();
        System.out.print("Enter multiple: ");
        int multiple = console.nextInt();
        int resultSum = 0;
        for (int k = start; k < end; k++) {
            if (k % multiple != 0)
                continue;
            resultSum += k;
        }
        System.out.println("Sum = " + resultSum);

        //Task11
        System.out.println("\nTask 11:");
        for (int rowT = 1; rowT <= 10; rowT++) {
            for (int colT = 1; colT <= rowT; colT++) {
                System.out.print("8");
            }
            System.out.println();
        }

        console.close();

    }
}
