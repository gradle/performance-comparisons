package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17065 {
    private final Productionnull_17065 production = new Productionnull_17065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}