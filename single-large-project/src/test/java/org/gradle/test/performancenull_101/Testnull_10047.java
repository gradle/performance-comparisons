package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10047 {
    private final Productionnull_10047 production = new Productionnull_10047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}