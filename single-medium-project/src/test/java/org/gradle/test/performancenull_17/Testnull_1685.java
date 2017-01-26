package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1685 {
    private final Productionnull_1685 production = new Productionnull_1685("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}