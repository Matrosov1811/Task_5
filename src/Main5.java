import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)");
        switch(s.next().charAt(0)) {
            case '+': System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-': System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*': System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/': System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:  System.out.println("Вы ввели некорректный оператор");
                break;
        }

    }

}
