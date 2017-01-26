package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37403 {
    private final Productionnull_37403 production = new Productionnull_37403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}