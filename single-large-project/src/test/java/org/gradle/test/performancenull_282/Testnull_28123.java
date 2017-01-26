package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28123 {
    private final Productionnull_28123 production = new Productionnull_28123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}