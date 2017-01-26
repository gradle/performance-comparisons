package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15088 {
    private final Productionnull_15088 production = new Productionnull_15088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}