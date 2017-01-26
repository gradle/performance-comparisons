package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32967 {
    private final Productionnull_32967 production = new Productionnull_32967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}