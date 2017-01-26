package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23063 {
    private final Productionnull_23063 production = new Productionnull_23063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}