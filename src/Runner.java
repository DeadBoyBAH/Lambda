/**
 * Этот класс запускает программу.
 * В ней можно использовать различные вычисления с двумя числами с помощью Лямбды
 *
 * @version 21.03.2020
 * @author Pukin Alexey
 */

public class Runner {
    public static void main(String[] args) {
        System.out.println("Сумма: " + calculate(20, 25, (double a, double b) -> a + b));
        System.out.println("Умножение: " + calculate(40, 20, (double a, double b) -> a * b));
        System.out.println("Деление: " + calculate(40, 20, (double a, double b) -> a / b));
        System.out.println("Максимальное число: " + calculate(150, 30, (double a, double b) -> Math.max(a, b)));
        System.out.println("Выражение: " + calculate(5, 3, (double a, double b) -> (Math.pow(Math.min(a, b),
                (Math.max(a, b) - Math.min(a, b))) * 10 / Math.max(a, b))));
        System.out.println("Число сочетаний: " + calculate(5, 2, (double a, double b) -> factorial(a) /
                (factorial(b) * factorial(a - b))));
        System.out.println("Гипотенуза треугольника: " + calculate(4, 3, (double a, double b) -> Math.sqrt(a * a + b * b)));

    }

    // метод вычисления факториала для подсчёта числа сочетаний
    public static double factorial(double n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }

    // метод вычислений двух чисел
    public static double calculate(double a, double b, ChangeCalculate changeCalculate) {

        return changeCalculate.changeCalculate(a, b);

    }
}
