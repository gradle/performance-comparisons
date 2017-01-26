package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21245 {
    private final Productionnull_21245 production = new Productionnull_21245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}