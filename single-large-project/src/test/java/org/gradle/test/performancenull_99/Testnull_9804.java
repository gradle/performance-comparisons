package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9804 {
    private final Productionnull_9804 production = new Productionnull_9804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}