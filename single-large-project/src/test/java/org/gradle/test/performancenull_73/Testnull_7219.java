package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7219 {
    private final Productionnull_7219 production = new Productionnull_7219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}