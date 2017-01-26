package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12668 {
    private final Productionnull_12668 production = new Productionnull_12668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}