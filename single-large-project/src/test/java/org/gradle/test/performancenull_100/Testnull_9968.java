package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9968 {
    private final Productionnull_9968 production = new Productionnull_9968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}