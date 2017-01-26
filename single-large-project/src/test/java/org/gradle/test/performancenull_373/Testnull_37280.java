package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37280 {
    private final Productionnull_37280 production = new Productionnull_37280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}