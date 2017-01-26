package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25530 {
    private final Productionnull_25530 production = new Productionnull_25530("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}