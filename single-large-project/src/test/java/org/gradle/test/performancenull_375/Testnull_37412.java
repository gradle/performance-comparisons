package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37412 {
    private final Productionnull_37412 production = new Productionnull_37412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}