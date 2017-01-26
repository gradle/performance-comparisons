package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28454 {
    private final Productionnull_28454 production = new Productionnull_28454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}