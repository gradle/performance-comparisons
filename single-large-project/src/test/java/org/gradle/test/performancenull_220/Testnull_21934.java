package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21934 {
    private final Productionnull_21934 production = new Productionnull_21934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}