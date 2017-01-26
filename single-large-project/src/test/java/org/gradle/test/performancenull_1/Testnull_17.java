package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_17 {
    private final Productionnull_17 production = new Productionnull_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}