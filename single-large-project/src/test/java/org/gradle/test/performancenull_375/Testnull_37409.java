package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37409 {
    private final Productionnull_37409 production = new Productionnull_37409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}