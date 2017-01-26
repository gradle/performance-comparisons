package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26462 {
    private final Productionnull_26462 production = new Productionnull_26462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}