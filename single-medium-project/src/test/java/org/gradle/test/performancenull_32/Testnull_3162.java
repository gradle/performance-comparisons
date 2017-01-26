package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3162 {
    private final Productionnull_3162 production = new Productionnull_3162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}