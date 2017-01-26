package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5705 {
    private final Productionnull_5705 production = new Productionnull_5705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}