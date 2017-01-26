package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23286 {
    private final Productionnull_23286 production = new Productionnull_23286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}