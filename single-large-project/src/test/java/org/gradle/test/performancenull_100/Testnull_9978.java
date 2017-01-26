package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9978 {
    private final Productionnull_9978 production = new Productionnull_9978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}