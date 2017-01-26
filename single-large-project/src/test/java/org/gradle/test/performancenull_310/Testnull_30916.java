package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30916 {
    private final Productionnull_30916 production = new Productionnull_30916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}