package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48373 {
    private final Productionnull_48373 production = new Productionnull_48373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}