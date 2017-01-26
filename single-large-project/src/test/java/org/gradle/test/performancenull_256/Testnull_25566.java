package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25566 {
    private final Productionnull_25566 production = new Productionnull_25566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}