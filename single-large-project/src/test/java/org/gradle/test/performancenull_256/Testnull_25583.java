package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25583 {
    private final Productionnull_25583 production = new Productionnull_25583("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}