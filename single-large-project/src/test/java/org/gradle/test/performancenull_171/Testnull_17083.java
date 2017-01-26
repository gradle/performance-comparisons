package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17083 {
    private final Productionnull_17083 production = new Productionnull_17083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}