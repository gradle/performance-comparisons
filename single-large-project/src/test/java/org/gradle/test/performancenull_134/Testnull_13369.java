package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13369 {
    private final Productionnull_13369 production = new Productionnull_13369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}