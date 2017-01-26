package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37423 {
    private final Productionnull_37423 production = new Productionnull_37423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}