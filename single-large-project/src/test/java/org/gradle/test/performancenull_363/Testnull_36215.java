package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36215 {
    private final Productionnull_36215 production = new Productionnull_36215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}