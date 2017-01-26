package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9495 {
    private final Productionnull_9495 production = new Productionnull_9495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}