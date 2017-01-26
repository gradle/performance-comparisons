package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28283 {
    private final Productionnull_28283 production = new Productionnull_28283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}