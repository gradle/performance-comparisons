package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33226 {
    private final Productionnull_33226 production = new Productionnull_33226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}