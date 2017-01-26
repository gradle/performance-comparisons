package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9979 {
    private final Productionnull_9979 production = new Productionnull_9979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}