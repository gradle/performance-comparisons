package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9068 {
    private final Productionnull_9068 production = new Productionnull_9068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}