package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25551 {
    private final Productionnull_25551 production = new Productionnull_25551("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}