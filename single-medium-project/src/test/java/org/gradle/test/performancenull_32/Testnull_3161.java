package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3161 {
    private final Productionnull_3161 production = new Productionnull_3161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}