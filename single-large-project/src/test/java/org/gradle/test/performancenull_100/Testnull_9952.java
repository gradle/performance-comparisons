package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9952 {
    private final Productionnull_9952 production = new Productionnull_9952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}