package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1543 {
    private final Productionnull_1543 production = new Productionnull_1543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}