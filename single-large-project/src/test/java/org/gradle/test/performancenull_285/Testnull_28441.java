package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28441 {
    private final Productionnull_28441 production = new Productionnull_28441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}