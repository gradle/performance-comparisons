package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6482 {
    private final Productionnull_6482 production = new Productionnull_6482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}