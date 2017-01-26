package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41372 {
    private final Productionnull_41372 production = new Productionnull_41372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}