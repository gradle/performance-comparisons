package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2148 {
    private final Productionnull_2148 production = new Productionnull_2148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}