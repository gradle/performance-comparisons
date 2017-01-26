package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2482 {
    private final Productionnull_2482 production = new Productionnull_2482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}