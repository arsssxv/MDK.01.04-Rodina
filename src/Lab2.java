import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вариант 14");
        System.out.println("Задание 15: Число -> Месяц");
        System.out.printf("Введите число для месяца: ");
        int month = scanner.nextInt();
        if(month == 12 || month == 1 || month == 2) System.out.println("Winter");
        else if (month == 3 || month == 4 || month == 5) System.out.println("Spring");
        else if (month == 6 || month == 7 || month == 8) System.out.println("Summer");
        else if (month == 9 || month == 10 || month == 11) System.out.println("Autumn");
        else System.out.print("Число вне диапазона месяцев");
        System.out.println("Задание 24: Секунды -> Категория");
        System.out.printf("Введите число в секундах для определения категории: ");
        int seconds = scanner.nextInt();
        int kategory;
        if (seconds <= 60) kategory = 1;
        else if (seconds >= 60 && seconds <= 3599) kategory = 2;
        else kategory = 3;
        switch(kategory)
        {
            case 1:
                System.out.println("Seconds");
                break;
            case 2:
                System.out.println("Minutes");
                break;
            case 3:
                System.out.println("Hours");
                break;
            default: System.out.println("Invalid");
                break;
        }
        System.out.println("Задание 8: Диапазон");
        System.out.println("Введите числа l,x,r для проверки уравнения l<=x<=r");
        int l = scanner.nextInt();
        int x = scanner.nextInt();
        int r = scanner.nextInt();
        String result = (l<=x && x<=r)? "In" : "Out";
        System.out.println(result);
    }
}