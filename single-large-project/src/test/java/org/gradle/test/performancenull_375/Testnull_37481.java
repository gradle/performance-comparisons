package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37481 {
    private final Productionnull_37481 production = new Productionnull_37481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}