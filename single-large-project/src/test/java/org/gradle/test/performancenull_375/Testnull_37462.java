package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37462 {
    private final Productionnull_37462 production = new Productionnull_37462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}