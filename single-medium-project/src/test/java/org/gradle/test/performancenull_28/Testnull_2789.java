package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2789 {
    private final Productionnull_2789 production = new Productionnull_2789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}