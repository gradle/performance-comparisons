package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23454 {
    private final Productionnull_23454 production = new Productionnull_23454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}