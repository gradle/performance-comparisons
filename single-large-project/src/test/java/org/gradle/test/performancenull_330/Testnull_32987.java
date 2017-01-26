package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32987 {
    private final Productionnull_32987 production = new Productionnull_32987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}