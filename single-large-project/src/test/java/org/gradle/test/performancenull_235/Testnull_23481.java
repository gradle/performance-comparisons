package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23481 {
    private final Productionnull_23481 production = new Productionnull_23481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}