package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25048 {
    private final Productionnull_25048 production = new Productionnull_25048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}