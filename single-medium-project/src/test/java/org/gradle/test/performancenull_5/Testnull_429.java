package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_429 {
    private final Productionnull_429 production = new Productionnull_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}