package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37485 {
    private final Productionnull_37485 production = new Productionnull_37485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}