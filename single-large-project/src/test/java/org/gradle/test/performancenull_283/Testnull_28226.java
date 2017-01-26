package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28226 {
    private final Productionnull_28226 production = new Productionnull_28226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}