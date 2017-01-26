package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9084 {
    private final Productionnull_9084 production = new Productionnull_9084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}