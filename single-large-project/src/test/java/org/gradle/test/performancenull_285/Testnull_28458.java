package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28458 {
    private final Productionnull_28458 production = new Productionnull_28458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}