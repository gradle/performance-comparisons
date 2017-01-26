package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37451 {
    private final Productionnull_37451 production = new Productionnull_37451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}