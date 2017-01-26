package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17912 {
    private final Productionnull_17912 production = new Productionnull_17912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}