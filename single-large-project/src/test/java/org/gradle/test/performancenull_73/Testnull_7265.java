package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7265 {
    private final Productionnull_7265 production = new Productionnull_7265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}