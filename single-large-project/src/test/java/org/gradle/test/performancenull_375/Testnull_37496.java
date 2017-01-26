package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37496 {
    private final Productionnull_37496 production = new Productionnull_37496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}