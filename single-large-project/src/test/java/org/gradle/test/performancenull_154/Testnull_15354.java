package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15354 {
    private final Productionnull_15354 production = new Productionnull_15354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}