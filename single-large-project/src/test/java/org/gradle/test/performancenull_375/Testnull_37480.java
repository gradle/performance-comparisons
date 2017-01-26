package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37480 {
    private final Productionnull_37480 production = new Productionnull_37480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}