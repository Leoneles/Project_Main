package ru.geekbrains.first_project;

public class First_project {

    public static void main(String[] args) {
        int variable_a = 2;
        boolean variable_b = true;
        String variable_c = "Hello";
        double variable_d = 10.3;
        System.out.println(variable_a);
        System.out.println(variable_b);
        System.out.println(variable_c);
        System.out.println(variable_d);
        System.out.println(countValue(2, 3, 9, 10));//
        System.out.println(checkingRange(20, 3));
        checkingMinus(10);
        System.out.println(checkingMinus2(11));
        greetingMe("Павел");
        checkingLeap(4);

    }
    static double countValue(double a, double b, double c, double d){
        return a * (b + (c / d));
    }
    static boolean checkingRange(int a, int b) {
        return (((a + b) > 9) && ((a + b) < 21));
    }
    static void checkingMinus(int a){
        if (a < 0){
            System.out.println("Число отрицательное");
        }
        else System.out.println("Число положительное");
    }
    static boolean checkingMinus2(int a){
        return (a < 0);

    }
    static void greetingMe(String a){
        System.out.println("Привет, " +a +"!");
    }
    static void checkingLeap(int a){
        if (a % 4 == 0 && a % 100 != 0){
            System.out.println("Год високосный");
        }
        else if (a % 100 == 0 && a % 400 == 0){
            System.out.println("Год високосный");
        }
        else if (a % 100 == 0){
            System.out.println("Год не високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}
