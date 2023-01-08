/**
 * К калькулятору из предыдущего дз добавить логирование
 */
package org.example;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
public class Main4 {
    private static Logger logger = Logger.getLogger(Main4.class.getName());
    public static void main(String[] args) {
        int num1;
         int num2;
         int result;
        char operation;
        try(PrintWriter out = new PrintWriter("Log.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            num1 = input.nextInt();
            out.println(("Введено первое число " + num1));
            System.out.println("Введите второе число: ");
            num2 = input.nextInt();
            out.println(("Введено второе число " + num2));
            System.out.println("Введите операцию: ");
            operation = input.next().charAt(0);
            out.println(("Введена операция " + operation));
            switch(operation) {
                case '+': result = num1 + num2;
                    break;
                case '-': result = num1 - num2;
                    break;
                case '*': result = num1 * num2;
                    break;
                case '/': result = num1 / num2;
                    break;
                default:  System.out.printf("Неправильный ввод знака");
                    return;
            }
            out.println(("Результат вычислений " + result));
            System.out.printf("%f %c %f =" + result + "\n", num1, operation, num2);

            logger.info("Записано в файл Log.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }
    }
}
