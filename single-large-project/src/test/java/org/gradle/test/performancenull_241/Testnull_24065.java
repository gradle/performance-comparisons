package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24065 {
    private final Productionnull_24065 production = new Productionnull_24065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}