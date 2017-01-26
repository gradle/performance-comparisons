package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11702 {
    private final Productionnull_11702 production = new Productionnull_11702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}