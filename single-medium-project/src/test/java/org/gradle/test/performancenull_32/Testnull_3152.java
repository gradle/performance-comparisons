package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3152 {
    private final Productionnull_3152 production = new Productionnull_3152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}