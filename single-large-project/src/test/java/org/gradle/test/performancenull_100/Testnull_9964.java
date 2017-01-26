package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9964 {
    private final Productionnull_9964 production = new Productionnull_9964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}