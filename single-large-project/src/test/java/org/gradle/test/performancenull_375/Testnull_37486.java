package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37486 {
    private final Productionnull_37486 production = new Productionnull_37486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}