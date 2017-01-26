package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25063 {
    private final Productionnull_25063 production = new Productionnull_25063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}