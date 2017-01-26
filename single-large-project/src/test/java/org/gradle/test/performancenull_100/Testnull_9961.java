package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9961 {
    private final Productionnull_9961 production = new Productionnull_9961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}