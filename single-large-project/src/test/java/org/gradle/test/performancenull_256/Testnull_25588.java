package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25588 {
    private final Productionnull_25588 production = new Productionnull_25588("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}