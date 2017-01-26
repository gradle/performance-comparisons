package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9908 {
    private final Productionnull_9908 production = new Productionnull_9908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}