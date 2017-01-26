package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11500 {
    private final Productionnull_11500 production = new Productionnull_11500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}