package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9996 {
    private final Productionnull_9996 production = new Productionnull_9996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}