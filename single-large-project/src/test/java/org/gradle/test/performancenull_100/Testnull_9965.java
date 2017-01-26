package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9965 {
    private final Productionnull_9965 production = new Productionnull_9965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}