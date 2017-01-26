package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20409 {
    private final Productionnull_20409 production = new Productionnull_20409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}