package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12445 {
    private final Productionnull_12445 production = new Productionnull_12445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}