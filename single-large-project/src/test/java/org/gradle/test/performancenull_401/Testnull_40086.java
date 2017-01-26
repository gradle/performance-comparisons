package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40086 {
    private final Productionnull_40086 production = new Productionnull_40086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}