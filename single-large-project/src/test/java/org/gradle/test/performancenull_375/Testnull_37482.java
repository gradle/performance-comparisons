package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37482 {
    private final Productionnull_37482 production = new Productionnull_37482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}