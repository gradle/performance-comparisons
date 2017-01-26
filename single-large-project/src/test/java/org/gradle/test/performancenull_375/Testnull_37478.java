package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37478 {
    private final Productionnull_37478 production = new Productionnull_37478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}