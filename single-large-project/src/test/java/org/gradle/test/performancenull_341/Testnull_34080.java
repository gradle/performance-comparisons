package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34080 {
    private final Productionnull_34080 production = new Productionnull_34080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}