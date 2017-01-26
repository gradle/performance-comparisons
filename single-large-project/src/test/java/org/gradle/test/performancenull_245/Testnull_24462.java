package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24462 {
    private final Productionnull_24462 production = new Productionnull_24462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}