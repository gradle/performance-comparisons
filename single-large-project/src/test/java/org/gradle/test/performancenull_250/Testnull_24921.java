package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24921 {
    private final Productionnull_24921 production = new Productionnull_24921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}