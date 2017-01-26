package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25463 {
    private final Productionnull_25463 production = new Productionnull_25463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}