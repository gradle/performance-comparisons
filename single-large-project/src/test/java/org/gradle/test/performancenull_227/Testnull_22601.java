package org.gradle.test.performancenull_227;

import static org.junit.Assert.*;

public class Testnull_22601 {
    private final Productionnull_22601 production = new Productionnull_22601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}