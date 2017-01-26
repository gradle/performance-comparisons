package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4987 {
    private final Productionnull_4987 production = new Productionnull_4987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}