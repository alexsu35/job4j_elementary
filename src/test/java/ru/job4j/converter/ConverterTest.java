package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert4EuroThen280Rbl() {
        float in = 4;
        float expected = 280;
        float out = Converter.euroToRuble(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert7DlrThen420Rbl() {
        float in = 7;
        float expected = 420;
        float out = Converter.dollarToRuble(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }
}