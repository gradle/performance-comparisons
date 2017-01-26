package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37446 {
    private final Productionnull_37446 production = new Productionnull_37446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}