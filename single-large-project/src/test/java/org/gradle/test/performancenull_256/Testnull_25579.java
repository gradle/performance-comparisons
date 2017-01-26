package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25579 {
    private final Productionnull_25579 production = new Productionnull_25579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}