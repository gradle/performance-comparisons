package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12281 {
    private final Productionnull_12281 production = new Productionnull_12281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}