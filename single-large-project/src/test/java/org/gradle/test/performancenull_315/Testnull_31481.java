package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31481 {
    private final Productionnull_31481 production = new Productionnull_31481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}