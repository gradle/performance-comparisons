package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_25000 {
    private final Productionnull_25000 production = new Productionnull_25000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}