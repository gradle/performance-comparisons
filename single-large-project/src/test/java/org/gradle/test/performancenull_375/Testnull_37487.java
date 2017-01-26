package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37487 {
    private final Productionnull_37487 production = new Productionnull_37487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}