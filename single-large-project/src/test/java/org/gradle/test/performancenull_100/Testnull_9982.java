package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9982 {
    private final Productionnull_9982 production = new Productionnull_9982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}