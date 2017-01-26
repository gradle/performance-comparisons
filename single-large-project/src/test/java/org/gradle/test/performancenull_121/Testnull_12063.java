package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12063 {
    private final Productionnull_12063 production = new Productionnull_12063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}