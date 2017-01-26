package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15942 {
    private final Productionnull_15942 production = new Productionnull_15942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}