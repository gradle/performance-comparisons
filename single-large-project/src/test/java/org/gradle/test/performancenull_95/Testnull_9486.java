package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9486 {
    private final Productionnull_9486 production = new Productionnull_9486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}