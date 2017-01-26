package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42920 {
    private final Productionnull_42920 production = new Productionnull_42920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}