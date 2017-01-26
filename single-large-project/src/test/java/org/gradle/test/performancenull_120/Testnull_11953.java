package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11953 {
    private final Productionnull_11953 production = new Productionnull_11953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}