package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37452 {
    private final Productionnull_37452 production = new Productionnull_37452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}