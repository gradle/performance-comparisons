package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17071 {
    private final Productionnull_17071 production = new Productionnull_17071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}