package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37416 {
    private final Productionnull_37416 production = new Productionnull_37416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}