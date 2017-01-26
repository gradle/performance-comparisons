package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31467 {
    private final Productionnull_31467 production = new Productionnull_31467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}