package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12258 {
    private final Productionnull_12258 production = new Productionnull_12258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}