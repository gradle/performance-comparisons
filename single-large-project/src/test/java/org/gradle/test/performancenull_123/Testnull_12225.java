package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12225 {
    private final Productionnull_12225 production = new Productionnull_12225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}