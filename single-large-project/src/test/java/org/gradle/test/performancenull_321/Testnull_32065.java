package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32065 {
    private final Productionnull_32065 production = new Productionnull_32065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}