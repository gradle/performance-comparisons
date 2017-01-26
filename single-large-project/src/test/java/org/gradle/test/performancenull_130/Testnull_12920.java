package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12920 {
    private final Productionnull_12920 production = new Productionnull_12920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}