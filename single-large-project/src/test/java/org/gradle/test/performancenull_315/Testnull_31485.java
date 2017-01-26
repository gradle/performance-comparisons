package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31485 {
    private final Productionnull_31485 production = new Productionnull_31485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}