package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41273 {
    private final Productionnull_41273 production = new Productionnull_41273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}