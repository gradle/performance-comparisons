package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31969 {
    private final Productionnull_31969 production = new Productionnull_31969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}