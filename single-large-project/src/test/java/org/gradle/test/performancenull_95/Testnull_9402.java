package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9402 {
    private final Productionnull_9402 production = new Productionnull_9402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}