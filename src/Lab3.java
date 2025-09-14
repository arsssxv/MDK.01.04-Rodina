import java.util.Scanner;

public class Lab3 {
    public static String isPalidrome(int n){
        String number = String.valueOf(n);
        StringBuilder bl = new StringBuilder(number);
        String temp = bl.reverse().toString();
        String result = (number.equalsIgnoreCase(temp))?
                "Число является числом Палиндрома" : "Число не является числом Палиндрома";
        return result;
    }
    public static String isArmstrong(int n)
    {
        String result = "";
        if (n < 0)
        {
            result = "Число не является числом Армстронга";
            return result;
        }
        int original = n;
        int numberOfDigits = String.valueOf(n).length();
        int sumNumbers = 0;
        while (n > 0) {
            int digit = n%10;
            sumNumbers += (int) Math.pow(digit,numberOfDigits);
            n /= 10;
        }
        if (original == sumNumbers) result = "Число является числом Армстронга";
        else result = "Число не является числом Армстронга";
        return result;
    }
    public static int nextEven (int n)
    {
        if(n%2!=0) n += 1;
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Вариант 14");
        System.out.println("Задание 1: ");
        System.out.println("Введите число для его проверки на число Палиндрома: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String answer = isPalidrome(number);
        System.out.println(answer);
        System.out.println("Задание 2: ");
        System.out.println("Введите число для его проверки на число Палиндрома: ");
        int armstrong = scan.nextInt();
        answer = isArmstrong(armstrong);
        System.out.println(answer);
        System.out.println("Задание 3: ");
        System.out.println("Введите число для нахождения ближайшего четного числа ");
        int even = scan.nextInt();
        even = nextEven(even);
        System.out.println("Ближайшее четное число: " + even);
    }
}