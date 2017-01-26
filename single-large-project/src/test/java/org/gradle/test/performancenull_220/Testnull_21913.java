package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21913 {
    private final Productionnull_21913 production = new Productionnull_21913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}