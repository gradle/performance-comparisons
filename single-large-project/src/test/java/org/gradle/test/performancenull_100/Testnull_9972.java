package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9972 {
    private final Productionnull_9972 production = new Productionnull_9972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}