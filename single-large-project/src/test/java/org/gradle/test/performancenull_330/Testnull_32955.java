package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32955 {
    private final Productionnull_32955 production = new Productionnull_32955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}