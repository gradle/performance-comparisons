package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22438 {
    private final Productionnull_22438 production = new Productionnull_22438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}