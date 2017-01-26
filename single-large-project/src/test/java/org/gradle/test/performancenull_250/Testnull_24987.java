package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24987 {
    private final Productionnull_24987 production = new Productionnull_24987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}