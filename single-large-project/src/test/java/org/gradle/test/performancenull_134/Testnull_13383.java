package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13383 {
    private final Productionnull_13383 production = new Productionnull_13383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}