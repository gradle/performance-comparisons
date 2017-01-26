package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5240 {
    private final Productionnull_5240 production = new Productionnull_5240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}