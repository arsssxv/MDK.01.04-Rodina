import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите длину: ");
        int length = scanner.nextInt();
        System.out.printf("Введите ширину: ");
        int width = scanner.nextInt();
        for(int i = 1; i <= width; i++)
        {
            if(i==1 || i == width)
            {
                for(int j = 1; j <= length; j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else
            {
                for(int j = 1; j <= length; j++)
                {
                    if(j==1 || j==length) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
}