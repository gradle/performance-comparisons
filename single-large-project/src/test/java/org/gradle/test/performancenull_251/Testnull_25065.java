package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25065 {
    private final Productionnull_25065 production = new Productionnull_25065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}