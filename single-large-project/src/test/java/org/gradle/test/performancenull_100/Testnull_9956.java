package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9956 {
    private final Productionnull_9956 production = new Productionnull_9956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}