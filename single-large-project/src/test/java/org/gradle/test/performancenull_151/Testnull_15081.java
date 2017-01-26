package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15081 {
    private final Productionnull_15081 production = new Productionnull_15081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}