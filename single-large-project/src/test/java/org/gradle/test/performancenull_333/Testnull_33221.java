package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33221 {
    private final Productionnull_33221 production = new Productionnull_33221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}