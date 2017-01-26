package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13348 {
    private final Productionnull_13348 production = new Productionnull_13348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}