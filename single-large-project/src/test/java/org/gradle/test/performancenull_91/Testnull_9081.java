package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9081 {
    private final Productionnull_9081 production = new Productionnull_9081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}