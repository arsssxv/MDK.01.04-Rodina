public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Вариант 14");
        System.out.println("Задание №1:");
        int number = 255;
        System.out.println("Перевод числа из 10-ой в 2-ую систему = " + Integer.toString(number,2));
        System.out.println("Перевод числа из 10-ой в 16-ую систему = " + Integer.toString(number,16));
        System.out.println();
        System.out.println("Задание №2:");
        char favorsymbol = '*';
        System.out.println("Любимый символ: " + favorsymbol);
        System.out.println();
        System.out.println("Задание №3: найдите сумму цифр числа 89.");
        String nomer = "89";
        var digits =  nomer.split("");
        int D1 = Integer.parseInt(digits[0]);
        int D2 = Integer.parseInt(digits[1]);
        System.out.println("Сумма цифр числа равна: " + (D1+D2));
    }
}