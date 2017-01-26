package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14088 {
    private final Productionnull_14088 production = new Productionnull_14088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}