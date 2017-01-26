package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9434 {
    private final Productionnull_9434 production = new Productionnull_9434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}