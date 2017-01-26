package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24989 {
    private final Productionnull_24989 production = new Productionnull_24989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}