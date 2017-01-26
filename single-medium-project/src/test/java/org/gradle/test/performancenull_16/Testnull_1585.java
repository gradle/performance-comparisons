package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1585 {
    private final Productionnull_1585 production = new Productionnull_1585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}