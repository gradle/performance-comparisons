package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31482 {
    private final Productionnull_31482 production = new Productionnull_31482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}