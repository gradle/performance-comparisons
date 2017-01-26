package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9963 {
    private final Productionnull_9963 production = new Productionnull_9963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}