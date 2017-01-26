package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12206 {
    private final Productionnull_12206 production = new Productionnull_12206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}