package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9925 {
    private final Productionnull_9925 production = new Productionnull_9925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}