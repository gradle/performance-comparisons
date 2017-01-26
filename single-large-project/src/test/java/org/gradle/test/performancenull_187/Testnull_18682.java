package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18682 {
    private final Productionnull_18682 production = new Productionnull_18682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}