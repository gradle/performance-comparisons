package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37430 {
    private final Productionnull_37430 production = new Productionnull_37430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}