/**
 * Реализовать простой калькулятор
 */
package org.example;
import java.io.IOException;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 1 число:: ");
        Integer number1 = iScanner.nextInt();
        System.out.print("Введите 2 число: ");
        Integer number2 = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        char ch = iScanner.next().charAt(0);
        int sum = 0;
        double div = 1;
        int sub = 0;
        int mult = 0;
        switch (ch) {
            case '+':
                sum = number1 + number2;
                System.out.printf("Сумма: %d", sum);
                break;
            case '-':
                sub = number1 - number2;
                System.out.printf("Разность: %d", sub);
                break;
            case '/':
                double num1 = number1;
                double num2 = number2;
                div = num1/num2;
                System.out.printf("Деление: %f", div);
                break;
            case '*':
                mult = number1 * number2;
                System.out.printf("Произведение: %d", mult);
                break;
        }
        iScanner.close();
    }
}