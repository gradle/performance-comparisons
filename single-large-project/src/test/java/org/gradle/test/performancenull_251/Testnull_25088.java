package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25088 {
    private final Productionnull_25088 production = new Productionnull_25088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}