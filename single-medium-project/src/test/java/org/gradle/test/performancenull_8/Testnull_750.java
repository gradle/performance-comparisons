package org.gradle.test.performancenull_8;

import static org.junit.Assert.*;

public class Testnull_750 {
    private final Productionnull_750 production = new Productionnull_750("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}