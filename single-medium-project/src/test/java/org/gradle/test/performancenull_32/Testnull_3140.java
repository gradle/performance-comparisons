package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3140 {
    private final Productionnull_3140 production = new Productionnull_3140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}