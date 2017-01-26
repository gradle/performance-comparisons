package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1804 {
    private final Productionnull_1804 production = new Productionnull_1804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}