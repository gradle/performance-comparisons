package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1883 {
    private final Productionnull_1883 production = new Productionnull_1883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}