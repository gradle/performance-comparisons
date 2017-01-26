package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17915 {
    private final Productionnull_17915 production = new Productionnull_17915("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}