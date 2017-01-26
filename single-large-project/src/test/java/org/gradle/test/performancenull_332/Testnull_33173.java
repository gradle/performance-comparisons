package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33173 {
    private final Productionnull_33173 production = new Productionnull_33173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}