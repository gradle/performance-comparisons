package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37434 {
    private final Productionnull_37434 production = new Productionnull_37434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}