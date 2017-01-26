package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5950 {
    private final Productionnull_5950 production = new Productionnull_5950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}