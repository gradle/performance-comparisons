package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9936 {
    private final Productionnull_9936 production = new Productionnull_9936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}