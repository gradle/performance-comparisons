package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37433 {
    private final Productionnull_37433 production = new Productionnull_37433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}