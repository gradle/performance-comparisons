package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18953 {
    private final Productionnull_18953 production = new Productionnull_18953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}