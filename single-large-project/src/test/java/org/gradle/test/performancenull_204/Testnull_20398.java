package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20398 {
    private final Productionnull_20398 production = new Productionnull_20398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}