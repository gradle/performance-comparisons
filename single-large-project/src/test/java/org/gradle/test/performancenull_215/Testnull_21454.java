package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21454 {
    private final Productionnull_21454 production = new Productionnull_21454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}