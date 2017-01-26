package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3127 {
    private final Productionnull_3127 production = new Productionnull_3127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}