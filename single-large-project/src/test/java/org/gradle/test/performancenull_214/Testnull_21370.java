package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21370 {
    private final Productionnull_21370 production = new Productionnull_21370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}