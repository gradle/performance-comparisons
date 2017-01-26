package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36454 {
    private final Productionnull_36454 production = new Productionnull_36454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}