package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1086 {
    private final Productionnull_1086 production = new Productionnull_1086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}