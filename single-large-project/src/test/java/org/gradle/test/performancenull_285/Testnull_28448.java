package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28448 {
    private final Productionnull_28448 production = new Productionnull_28448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}