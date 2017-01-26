package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37287 {
    private final Productionnull_37287 production = new Productionnull_37287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}