package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3299 {
    private final Productionnull_3299 production = new Productionnull_3299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}