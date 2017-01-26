package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9062 {
    private final Productionnull_9062 production = new Productionnull_9062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}