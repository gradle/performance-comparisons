package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19409 {
    private final Productionnull_19409 production = new Productionnull_19409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}