package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18668 {
    private final Productionnull_18668 production = new Productionnull_18668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}