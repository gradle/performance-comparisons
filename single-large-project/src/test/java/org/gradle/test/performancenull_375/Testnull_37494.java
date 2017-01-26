package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37494 {
    private final Productionnull_37494 production = new Productionnull_37494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}