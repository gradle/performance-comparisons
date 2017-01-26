package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9086 {
    private final Productionnull_9086 production = new Productionnull_9086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}