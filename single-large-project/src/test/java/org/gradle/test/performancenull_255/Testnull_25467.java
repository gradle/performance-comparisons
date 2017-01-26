package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25467 {
    private final Productionnull_25467 production = new Productionnull_25467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}