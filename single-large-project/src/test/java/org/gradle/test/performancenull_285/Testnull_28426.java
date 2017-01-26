package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28426 {
    private final Productionnull_28426 production = new Productionnull_28426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}