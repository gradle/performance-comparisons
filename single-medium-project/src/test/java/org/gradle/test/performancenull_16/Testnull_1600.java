package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1600 {
    private final Productionnull_1600 production = new Productionnull_1600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}