package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18262 {
    private final Productionnull_18262 production = new Productionnull_18262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}