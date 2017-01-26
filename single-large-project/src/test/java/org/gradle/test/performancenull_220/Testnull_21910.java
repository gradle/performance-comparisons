package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21910 {
    private final Productionnull_21910 production = new Productionnull_21910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}