package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3150 {
    private final Productionnull_3150 production = new Productionnull_3150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}