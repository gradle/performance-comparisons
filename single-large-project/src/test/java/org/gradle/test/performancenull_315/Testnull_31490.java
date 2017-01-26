package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31490 {
    private final Productionnull_31490 production = new Productionnull_31490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}