package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9951 {
    private final Productionnull_9951 production = new Productionnull_9951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}