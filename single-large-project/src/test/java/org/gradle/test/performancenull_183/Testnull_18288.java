package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18288 {
    private final Productionnull_18288 production = new Productionnull_18288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}