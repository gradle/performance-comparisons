package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13300 {
    private final Productionnull_13300 production = new Productionnull_13300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}