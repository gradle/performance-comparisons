package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9935 {
    private final Productionnull_9935 production = new Productionnull_9935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}