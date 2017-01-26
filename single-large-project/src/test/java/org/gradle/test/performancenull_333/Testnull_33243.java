package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33243 {
    private final Productionnull_33243 production = new Productionnull_33243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}