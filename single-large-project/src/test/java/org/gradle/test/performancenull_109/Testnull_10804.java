package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10804 {
    private final Productionnull_10804 production = new Productionnull_10804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}