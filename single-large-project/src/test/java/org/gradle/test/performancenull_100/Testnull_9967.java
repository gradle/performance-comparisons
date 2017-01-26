package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9967 {
    private final Productionnull_9967 production = new Productionnull_9967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}