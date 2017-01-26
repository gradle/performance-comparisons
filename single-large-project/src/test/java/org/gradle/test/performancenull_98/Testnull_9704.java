package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9704 {
    private final Productionnull_9704 production = new Productionnull_9704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}