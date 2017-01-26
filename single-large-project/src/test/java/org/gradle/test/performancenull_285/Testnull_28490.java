package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28490 {
    private final Productionnull_28490 production = new Productionnull_28490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}