package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9987 {
    private final Productionnull_9987 production = new Productionnull_9987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}