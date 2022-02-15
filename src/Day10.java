import java.util.Random;
import java.util.Scanner;
/*
16.Write a program that generates a random number and asks the user
to guess what the number is. If the user’s guess is higher than the
random number, the program should display Too high, try again. If the
user’s guess is lower than the random number, the program should
display Too low, try again. If you find the number print Yes, you
guessed the number.The program should use a loop that repeats
until the user correctly guesses the random number.
 */

public class Day10 {
    public static void guessNumber(){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rn.nextInt(100) + 1;
        boolean b = false;
        while (!b) {
            System.out.println("Guess a number 1 to 100");
            int answer = sc.nextInt();
            if (answer > number) {
                System.out.println("Too high try again");
            } else if (answer < number) {
                System.out.println("Too low try again");
            } else
                System.out.println("You guessed the number");


        }

    }
    /*
    Write a Java Program to Compute the Sum of Digits in a given
Integer.
     */
    public static void sumofNumDigits(int num){
        int a;
        int sum = 0;
        while (num > 0) {
            a = num % 10;
            sum = a + sum;
            num = num / 10;
        }
        System.out.println("The sum of number digits"+" "+sum);
    }


    public static void printNum() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void printEvenNumber() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    public static void descendingOrder(int n) {

        for (int i = n; i > 0; i--) {
            System.out.println(i);

        }
    }

    public static void multipleOfTwo(int number) {
        for (int i = number; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void multipleofTree(int n1) {
        for (int i = 0; i <= n1; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void smallDivisor(int n) {
        if (n % 2 == 0) {
            System.out.println(2);

        } else

            for (int i = 3; i + i <= n; i += 2) {
                if (n % i == 0) {
                    System.out.println(i);
                    break;
                }
                System.out.println(n);
            }
    }
    /*
    8. Input N natural number till N would be the exact power of 2.If N is
the exact power of 2 .
     */

    public static void exactPowerofTwo(int n) {
        while (n != 1) {
            n = n / 2;
            if ((n % 2 != 0) && (n != 1)) {
                System.out.println("no");
                break;
            } else
                System.out.println(n);
        }
    }
    /*
    14.The deposit in the bank is x dollars. It increases annually by p
percent, after which the fractional part of cents is discarded.

Determine how many years the contribution(ներդրում) will be at
least y dollars.(Input x , p , y from console)
     */

    public static void contributionLeast(int x, int p, int y) {
        int i = 0;
        int sum;
        sum = x + (x / 100) * p;
        while (y > sum) {
            i++;
            sum = sum + (sum / 100) * p;

        }
        System.out.println(i - 1);

    }
    /*
    10.Write Java program to print the table of characters that are
equivalent to the Ascii codes from 32 to 122.Print 10 characters
at each line.
     */

    public static void asciiCode() {
        int i;
        int count = 0;

        for (i = 32; i <= 122; i++) {
            count++;
            if (count % 10 == 0) {
                System.out.print("\n");
            } else
                System.out.print((char) i + " ");
        }
    }
    /*
    12.Given integer number A &gt; 1,define what is the Fibonacci number
is A, i.e print such number n that φn=A.If A is not a Fibonacci
number print -1.
     */

    public static void checkFibonacci(int a) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i;
        int n = 10;

        for (i = 1; i < n; i++) {
            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
            if (a == n3) {
                System.out.println(i);
                break;
            }

        }
        if (a != n3) {
            System.out.println(-1);
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        guessNumber();

        printNum();
        printEvenNumber();

        int n = sc.nextInt();
        descendingOrder(20);
        multipleOfTwo(18);
        int n1 = sc.nextInt();
        multipleofTree(21);
        smallDivisor(n);
        exactPowerofTwo(n);
        asciiCode();
        int a= sc.nextInt();
        checkFibonacci(a);
    }
}
