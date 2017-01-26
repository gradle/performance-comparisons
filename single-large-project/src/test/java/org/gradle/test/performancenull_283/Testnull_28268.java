package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28268 {
    private final Productionnull_28268 production = new Productionnull_28268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}