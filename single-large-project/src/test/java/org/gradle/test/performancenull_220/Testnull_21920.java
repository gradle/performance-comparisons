package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21920 {
    private final Productionnull_21920 production = new Productionnull_21920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}