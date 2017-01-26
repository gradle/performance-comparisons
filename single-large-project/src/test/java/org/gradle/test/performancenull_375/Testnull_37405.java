package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37405 {
    private final Productionnull_37405 production = new Productionnull_37405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}