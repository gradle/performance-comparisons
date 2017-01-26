package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37499 {
    private final Productionnull_37499 production = new Productionnull_37499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}