package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37419 {
    private final Productionnull_37419 production = new Productionnull_37419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}