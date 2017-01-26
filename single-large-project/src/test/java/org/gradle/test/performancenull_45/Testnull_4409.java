package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4409 {
    private final Productionnull_4409 production = new Productionnull_4409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}