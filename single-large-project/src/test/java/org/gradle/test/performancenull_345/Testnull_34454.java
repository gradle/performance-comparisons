package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34454 {
    private final Productionnull_34454 production = new Productionnull_34454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}