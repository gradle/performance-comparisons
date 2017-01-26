package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9001 {
    private final Productionnull_9001 production = new Productionnull_9001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}