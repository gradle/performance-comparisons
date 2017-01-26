package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22482 {
    private final Productionnull_22482 production = new Productionnull_22482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}