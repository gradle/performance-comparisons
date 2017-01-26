package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21328 {
    private final Productionnull_21328 production = new Productionnull_21328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}