package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21940 {
    private final Productionnull_21940 production = new Productionnull_21940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}