package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9472 {
    private final Productionnull_9472 production = new Productionnull_9472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}