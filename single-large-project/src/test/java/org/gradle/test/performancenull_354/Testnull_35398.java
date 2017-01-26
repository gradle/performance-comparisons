package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35398 {
    private final Productionnull_35398 production = new Productionnull_35398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}