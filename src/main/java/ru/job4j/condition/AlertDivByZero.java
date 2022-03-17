package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        posibleDiv(4);
        posibleDiv(0);
        posibleDiv(-8);
    }

    public static void posibleDiv(int number) {
        if (number == 0) {
            System.out.println(number + " " + "Could not div by 0.");
        }
        if (number > 0) {
            System.out.println(number + " " + "This is positive number");
        }
        if (number < 0) {
            System.out.println(number + " " + "This is negative number");
        }
    }
}
