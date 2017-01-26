package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9405 {
    private final Productionnull_9405 production = new Productionnull_9405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}