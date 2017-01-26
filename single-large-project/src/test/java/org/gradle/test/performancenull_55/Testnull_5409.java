package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5409 {
    private final Productionnull_5409 production = new Productionnull_5409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}