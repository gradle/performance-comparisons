package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23468 {
    private final Productionnull_23468 production = new Productionnull_23468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}