package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32006 {
    private final Productionnull_32006 production = new Productionnull_32006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}