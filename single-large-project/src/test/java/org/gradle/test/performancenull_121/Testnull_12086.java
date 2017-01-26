package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12086 {
    private final Productionnull_12086 production = new Productionnull_12086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}