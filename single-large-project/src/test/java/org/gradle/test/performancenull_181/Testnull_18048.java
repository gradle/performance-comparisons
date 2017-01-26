package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18048 {
    private final Productionnull_18048 production = new Productionnull_18048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}