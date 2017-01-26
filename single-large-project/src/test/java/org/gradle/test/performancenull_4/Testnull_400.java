package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_400 {
    private final Productionnull_400 production = new Productionnull_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}