package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21822 {
    private final Productionnull_21822 production = new Productionnull_21822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}