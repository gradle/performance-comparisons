package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48391 {
    private final Productionnull_48391 production = new Productionnull_48391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}