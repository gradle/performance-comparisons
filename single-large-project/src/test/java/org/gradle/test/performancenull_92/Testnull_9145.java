package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9145 {
    private final Productionnull_9145 production = new Productionnull_9145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}