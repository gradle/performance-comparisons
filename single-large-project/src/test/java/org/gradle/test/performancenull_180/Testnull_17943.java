package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17943 {
    private final Productionnull_17943 production = new Productionnull_17943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}