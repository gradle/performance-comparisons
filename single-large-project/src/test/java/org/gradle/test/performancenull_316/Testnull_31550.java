package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31550 {
    private final Productionnull_31550 production = new Productionnull_31550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}