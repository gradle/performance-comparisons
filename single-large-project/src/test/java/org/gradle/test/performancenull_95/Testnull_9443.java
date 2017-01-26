package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9443 {
    private final Productionnull_9443 production = new Productionnull_9443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}