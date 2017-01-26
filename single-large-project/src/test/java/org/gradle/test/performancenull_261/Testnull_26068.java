package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26068 {
    private final Productionnull_26068 production = new Productionnull_26068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}