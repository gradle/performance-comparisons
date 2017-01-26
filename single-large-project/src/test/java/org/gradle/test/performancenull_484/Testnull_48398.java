package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48398 {
    private final Productionnull_48398 production = new Productionnull_48398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}