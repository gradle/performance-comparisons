package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9464 {
    private final Productionnull_9464 production = new Productionnull_9464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}