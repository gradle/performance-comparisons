package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24916 {
    private final Productionnull_24916 production = new Productionnull_24916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}