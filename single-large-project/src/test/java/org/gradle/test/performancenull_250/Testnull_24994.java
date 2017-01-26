package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24994 {
    private final Productionnull_24994 production = new Productionnull_24994("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}