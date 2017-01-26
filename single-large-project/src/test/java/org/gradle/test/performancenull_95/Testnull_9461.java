package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9461 {
    private final Productionnull_9461 production = new Productionnull_9461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}