package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9930 {
    private final Productionnull_9930 production = new Productionnull_9930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}