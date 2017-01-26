package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2048 {
    private final Productionnull_2048 production = new Productionnull_2048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}