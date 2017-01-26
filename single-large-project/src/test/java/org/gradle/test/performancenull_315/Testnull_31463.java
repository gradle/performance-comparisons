package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31463 {
    private final Productionnull_31463 production = new Productionnull_31463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}