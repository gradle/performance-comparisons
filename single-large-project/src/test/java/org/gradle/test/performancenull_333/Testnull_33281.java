package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33281 {
    private final Productionnull_33281 production = new Productionnull_33281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}