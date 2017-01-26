package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17090 {
    private final Productionnull_17090 production = new Productionnull_17090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}