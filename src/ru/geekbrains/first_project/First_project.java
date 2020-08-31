package ru.geekbrains.first_project;

public class First_project {

    public static void main(String[] args) { //обьявление метода main (задание 1)
        int variable_a = 2; // целочисленные переменные (задание 2)
        boolean variable_b = true; // логические переменные (задание 2)
        String variable_c = "Hello"; //строковые переменные (задание 2)
        double variable_d = 10.3; // вещественные переменные (задание 2)
        System.out.println(variable_a);
        System.out.println(variable_b);
        System.out.println(variable_c);
        System.out.println(variable_d);
        System.out.println(countValue(2, 3, 9, 10));// Задание 3
        System.out.println(checkingRange(20, 3)); // Задание 4
        checkingMinus(10);  // Задание 5
        System.out.println(checkingMinus2(11)); // Задание 6
        greetingMe("Павел"); // Задание 7
        checkingLeap(4); // Задание 8

    }
    static double countValue(double a, double b, double c, double d){
        return a * (b + (c / d)); // задание три - решение выражения и последующий вывод значения
    }
    static boolean checkingRange(int a, int b) {
        return (((a + b) > 9) && ((a + b) < 21)); // задание четыре - проверить, входит ли сумма двух чисел в прмежуток от 10 до 20 (включительно)
    }
    static void checkingMinus(int a){
        if (a < 0){ // задание пять - проверить является число положительным или отрицательным, с условием, что 0 - положительное число
            System.out.println("Число отрицательное");
        }
        else System.out.println("Число положительное");
    }
    static boolean checkingMinus2(int a){
        return (a < 0); // задание шесть - если число положительное - вывести false, если отрицательное - true

    }
    static void greetingMe(String a){
        System.out.println("Привет, " +a +"!"); // задание семь - вывести приветствие с определённым именем
    }
    static void checkingLeap(int a){ // задание восемь - проверка года на високосность
        if (a % 4 == 0 && a % 100 != 0){ // делиться ли год на 4 нацело, при этом не делясь на 100 нацело
            System.out.println("Год високосный");
        }
        else if (a % 100 == 0 && a % 400 == 0){ // делиться ли год на 100 и на 400 нацело одновременно
            System.out.println("Год високосный");
        }
        else if (a % 100 == 0){ // високосный год не должен делиться нацело на 100
            System.out.println("Год не високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}
