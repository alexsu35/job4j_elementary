package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float rubleeuro = Converter.euroToRuble(2);
        float rubledollar = Converter.dollarToRuble(2);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("2 euro are " + rubleeuro + " ruble.");
        System.out.println("2 dollar are " + rubledollar + " ruble.");
        System.out.println("Test rubleToEuro:");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("Test rubleToEuro:");
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed2);
        System.out.println("Test rubleToEuro:");
        float in3 = 2;
        float expected3 = 140;
        float out3 = Converter.euroToRuble(in);
        boolean passed3 = expected == out;
        System.out.println("2 euro are 140 rubles. Test result : " + passed3);
        System.out.println("Test rubleToEuro:");
        float in4 = 2;
        float expected4 = 120;
        float out4 = Converter.dollarToRuble(in);
        boolean passed4 = expected == out;
        System.out.println("2 dollars are 120 rublles. Test result : " + passed4);

    }
}