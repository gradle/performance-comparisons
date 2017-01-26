package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11083 {
    private final Productionnull_11083 production = new Productionnull_11083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}