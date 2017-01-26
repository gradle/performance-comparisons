package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13370 {
    private final Productionnull_13370 production = new Productionnull_13370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}