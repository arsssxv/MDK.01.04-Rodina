import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {
    public static void printArray(double[] a){
        for(int i = 0; i < a.length; i++)
        {
            System.out.printf(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Вариант 14");
        System.out.println("Задание 1: Ввод массива");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int length = scanner.nextInt();
        System.out.println("Введите числа массива:");
        double array[] = new double[length];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextDouble();
        }
        System.out.println("Задание 2: Нахождение минимального числа");
        double minimal = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimal)
            {
                minimal = array[i];
            }
        }
        System.out.println("Минимальное число массива = " + minimal);
        System.out.println("Задание 3: Вывод массива");
        printArray(array);
    }
}