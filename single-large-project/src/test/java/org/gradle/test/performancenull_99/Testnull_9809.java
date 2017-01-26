package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9809 {
    private final Productionnull_9809 production = new Productionnull_9809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}