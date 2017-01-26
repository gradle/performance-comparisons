package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9502 {
    private final Productionnull_9502 production = new Productionnull_9502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}