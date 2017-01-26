package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25036 {
    private final Productionnull_25036 production = new Productionnull_25036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}