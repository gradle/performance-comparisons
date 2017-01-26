package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28144 {
    private final Productionnull_28144 production = new Productionnull_28144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}