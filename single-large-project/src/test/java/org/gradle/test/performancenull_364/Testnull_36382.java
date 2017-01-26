package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36382 {
    private final Productionnull_36382 production = new Productionnull_36382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}