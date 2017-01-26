package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31501 {
    private final Productionnull_31501 production = new Productionnull_31501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}