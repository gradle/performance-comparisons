package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26942 {
    private final Productionnull_26942 production = new Productionnull_26942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}