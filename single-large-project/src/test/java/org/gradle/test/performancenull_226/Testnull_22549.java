package org.gradle.test.performancenull_226;

import static org.junit.Assert.*;

public class Testnull_22549 {
    private final Productionnull_22549 production = new Productionnull_22549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}