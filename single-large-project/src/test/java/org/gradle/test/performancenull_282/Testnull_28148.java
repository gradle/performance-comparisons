package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28148 {
    private final Productionnull_28148 production = new Productionnull_28148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}