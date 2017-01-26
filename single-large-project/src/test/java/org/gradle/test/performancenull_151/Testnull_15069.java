package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15069 {
    private final Productionnull_15069 production = new Productionnull_15069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}