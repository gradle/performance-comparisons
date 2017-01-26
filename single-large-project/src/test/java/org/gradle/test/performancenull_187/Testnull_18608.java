package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18608 {
    private final Productionnull_18608 production = new Productionnull_18608("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}