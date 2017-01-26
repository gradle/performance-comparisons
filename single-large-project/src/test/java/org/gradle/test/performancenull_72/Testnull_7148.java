package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7148 {
    private final Productionnull_7148 production = new Productionnull_7148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}