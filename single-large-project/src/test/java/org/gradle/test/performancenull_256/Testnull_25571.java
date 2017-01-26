package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25571 {
    private final Productionnull_25571 production = new Productionnull_25571("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}