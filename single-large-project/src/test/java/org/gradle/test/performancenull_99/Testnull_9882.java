package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9882 {
    private final Productionnull_9882 production = new Productionnull_9882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}